package Inheritance;

public class Person {
    String name, email;
    int age, mob, dob;

    //parameterized Constructor
    Person(String n, String email, int a, int m, int d) {
        name = n;
        this.email = email;
        age = a;
        mob = m;
        dob = d;
    }

}

class Student1 extends Person {
    int roll, phy, chem, maths;
    Student1(String n, String e, int a, int mo, int d, int r, int p, int c, int m) {
        super(n, e, a, mo, d);
        roll = r;
        phy = p;
        chem = c;
        maths = m;
    }

    void cal_Avg() {
        System.out.println("Average Marks is: " + ((phy + chem + maths) / 3));
    }
    
}

class Test {
    public static void main(String[] args) {
        
        Student1 S = new Student1("Ratesh", "asd", 21, 123456, 19082000, 19, 85, 70, 80);
        System.out.println(S.name);
        System.out.println(S.age);
        System.out.println(S.maths);
        S.cal_Avg();

    }
}
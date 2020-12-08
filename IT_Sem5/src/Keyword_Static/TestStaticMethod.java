package Keyword_Static;

class Student {

    int rollno;
    String name;
    static String college = "IPS";

    /*static method to change the value of static variable*/
    static void change() {
        college = "CDGI";
    }

    /*constructor to initialize the variable*/
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
//method to display values

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

/*Test class to create and display the values of object */
public class TestStaticMethod {

    public static void main(String args[]) {
        //calling change method
        Student.change();

        //creating objects  
        Student s1 = new Student(111, "Roshan");
        Student s2 = new Student(222, "Ritik");
        Student s3 = new Student(333, "Sunny");

        //calling display method  
        s1.display();
        s2.display();
        s3.display();
    }
}

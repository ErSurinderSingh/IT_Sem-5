package Keyword_Super;


class Animal {

    final void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {

    /*void eat() {
        System.out.println("eating bread...");
    }*/

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        eat();
        bark();
    }
}

class TestSuper2 {

    public static void main(String args[]) {
        Dog d = new Dog();
        d.work();
        System.out.println(d instanceof Animal);
    }
    }

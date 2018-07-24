package oo;


public class A {
    int a = 3;

    public A() {

    }

    public A(String wang, int i) {
    }
}

class B extends A {
    int a = 2;

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        A a = new B();
        System.out.println(a.a);

    }
}

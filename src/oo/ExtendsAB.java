package oo;

public class ExtendsAB {

    public static void main(String[] args) {
        Shape sh = new circle();
        System.out.println(sh.name);
        sh.printType();
        sh.printName();
    }

}

class Shape {
    public String name = "shape";

    public Shape() {
        System.out.println("shape constructor");
    }

    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape");
    }
}

class circle extends Shape {
    public String name = "circle";

    public circle() {
        System.out.println("circle constructor");
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }
}
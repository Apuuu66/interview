package oo;

public class StaticTest {
    public static void main(String args[]) {
        staticFunction();
        System.out.println(b);
    }

    static StaticTest st = new StaticTest();

    static {
        System.out.println("1");
    }

    StaticTest() {
        System.out.println("3");
        System.out.println("a=" + a + " b=" + b);
    }

    public static void staticFunction() {
        System.out.println("4");
    }

    {
        System.out.println("2");
    }

    int a = 100;
    static int b = 112;
}

package oo;

public class IntCache {
    public static void main(String[] args) {
        Integer x = new Integer(200);
        Integer y = new Integer(123);
        System.out.println(x == y);    // false
        Integer z = 200;
        Integer k = Integer.valueOf(200);
        System.out.println(z == k);   // true

    }
}

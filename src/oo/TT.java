package oo;


public class TT implements MyInterface {
    public static void main(String[] args) {
        String a = "a";
        String param = "b" + a;
        System.out.println("ba" == param.intern());
        System.out.println(param == "ba");
        new TT().geaa(2);
    }

    @Override
    public void geaa(int a) {
        System.out.println(4);
    }
}

package oo;
public class Intern{
    public static void main(String[] args) {
        String s = new StringBuilder("计算机").append("软件").toString();
        System.out.println(s.intern() == s);
        java.lang.String s1 = new StringBuilder("ja").append("va").toString();
        System.out.println(s1.intern() == s1);
        String a = "a";
        String b = a;
        String c = a + "c";
        String d = "a" + "b";
        Integer.valueOf(1);
    }
}
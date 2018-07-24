package annotation;

public class NoBug {
    @MyTest
    public void suanShu() {
        System.out.println("1234567890");
    }

    @MyTest
    public void jiafa() {
        System.out.println("1+1=" + 1 + 1);
    }

    @MyTest
    public void jiefa() {
        System.out.println("1-1=" + (1 - 1));
    }

    @MyTest
    public void chengfa() {
        System.out.println("3 x 5=" + 3 * 5);
    }

    @MyTest
    public void chufa() {
        System.out.println("6 / 0=" + 6 / 0);
    }

    public void ziwojieshao() {
        System.out.println("我写的程序没有 bug!");
    }
}

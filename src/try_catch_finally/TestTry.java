package try_catch_finally;

public class TestTry {
    public static void main(String[] args) {
//        System.out.println(test01());
//        System.out.println(test02());
        System.out.println(test03());
    }

    public static int returnSttat(int i) {
        System.out.println("return block" + i);
        return i;
    }


    public static int test01() {
        int i = 1;
        int divid = 0;
        try {
            int n = i / divid;
        } catch (Exception e) {
            System.out.println("catch block");
            return returnSttat(i);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("qqq");
        return 0;
    }

    public static int test02() {
        int i = 1;
        try {
            System.out.println("try block");
            return returnSttat(i);
        } catch (Exception e) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
//            return returnSttat(0);
        }
        return 2;
    }

    public static User test03() {
        User user = new User("kk");
        try {
            System.out.println("try block: " + user);
            return user;
        } finally {
            user = new User("jj");
//            return user;
        }
    }

    static class User {
        String name;

        User(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return hashCode() + ":" + name;
        }
    }
}

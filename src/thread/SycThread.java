package thread;

public class SycThread {
    final static int LOOP = 10000;

    public static int count = 0;


    static class AddThread extends Thread {
        public void run() {
            for (int i = 0; i < SycThread.LOOP; i++) {
                SycThread.count += 1;
            }
        }
    }

    static class DecThread extends Thread {
        public void run() {
            for (int i = 0; i < SycThread.LOOP; i++) {
                SycThread.count -= 1;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t1 = new AddThread();
        Thread t2 = new DecThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }

}

package thread;

public class HelloThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (!isInterrupted()) {
            System.out.println("Hello Thread" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        HelloThread helloThread = new HelloThread();
        helloThread.start();
//        Thread.sleep(1000);
//        helloThread.interrupt();
        System.out.println(" parent thread begin ");
        Thread.currentThread().setDaemon(true);
    }
}

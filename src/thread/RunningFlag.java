package thread;

public class RunningFlag extends Thread {
    volatile boolean running = true;

    @Override
    public void run() {
        int i = 0;
        while (running) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i++);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        RunningFlag runningFlag = new RunningFlag();
        runningFlag.start();
        Thread.sleep(100);
        runningFlag.running = false;
        System.out.println("main end");
    }
}

package thread;

import org.junit.Test;

public class HelloThreadTest {

    @Test
    public void run() throws InterruptedException {
        HelloThread helloThread = new HelloThread();
        helloThread.start();
//        System.out.println("main");
//        helloThread.interrupt();
//        helloThread.join();
    }
}
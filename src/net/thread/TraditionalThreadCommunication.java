package net.thread;

/**
 * Created by IntelliJ IDEA.
 * User: kevin
 * Date: 2018/7/7
 */
/*经典面试题
        子线程循环10次，接着主线程循环100次，接着又回到子线程循环10次，接着再主线程循环100次，
        如此循环50次，请写出程序*/
public class TraditionalThreadCommunication {

    public static void main(String[] args) {
        final Business business = new Business();

        // 子线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    business.sub(i);
                }
            }
        }).start();

        // main方法主线程
        for (int i = 0; i < 50; i++) {
            business.main(i);
        }
    }

}
/**
 * 线程业务处理类
 * @author Administrator
 *
 */
class Business{
    // 子线程是否可以调用
    private boolean subShould = true;

    // 子线程业务方法
    public synchronized void sub(int i){
        while(!subShould){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("sub thread sequence of " + j + " ,loop of " + i);
        }
        subShould = false;
        this.notify();
    }

    // 主线程业务方法
    public synchronized void main(int i){
        while(subShould){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int j = 0; j < 100; j++) {
            System.out.println("main thread sequence of " + j + " ,loop of " + i);
        }
        subShould = true;
        this.notify();
    }
}

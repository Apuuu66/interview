package net.thread;

/**
 * Created by IntelliJ IDEA.
 * User: kevin
 * Date: 2018/7/7
 */
public class ThreadTest {
    public static void main(String[] args) {
      /*  Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("1:" + Thread.currentThread().getName());
                    // 这里可以使用this，因为这个是Thread的匿名内部类，this表示Thread这个对象，
                    // 但是一般不这样使用，一般还是使用上面的方式
                    System.out.println("2:" + this.getName());
                }
            }
        };
        t1.start();
*/

/*        // 第二种，实现Runnable
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("3:"+Thread.currentThread().getName());
                    // 这里不能使用this.getName() 因为this表示的是Runnable这个对象
                }
            }
        });
        t2.start();*/

        // 思考：这种方式考虑下，会调用哪个Run方法，提示：面向对象，方法覆盖
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("4:"+Thread.currentThread().getName());
            }
        }){
            @Override
            public void run() {
                System.out.println("5:"+Thread.currentThread().getName());
            }
        }.start();
        try {
            new Thread().join();
            new Object().wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


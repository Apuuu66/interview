package net.thread;

/**
 * Created by IntelliJ IDEA.
 * User: kevin
 * Date: 2018/7/7
 */
public class TraditionalTimerTest {
/*//    示例应用场景1：设定一个定时器，10秒之后爆炸
    public static void main(String[] args) {

        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("boom!");
            }

        }, 10000);

        while(true){
            System.out.println(new Date().getSeconds());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }*/
/*//    示例应用场景2：设定一个定时器，10秒之后爆炸，之后每隔3秒炸一次
    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("boom!");
            }
        }, 10000,3000);
    }*/
}

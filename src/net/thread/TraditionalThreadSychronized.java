package net.thread;

/**
 * Created by IntelliJ IDEA.
 * User: kevin
 * Date: 2018/7/7
 */
public class TraditionalThreadSychronized {
    class Outputer {

        // 这里打印，采取一个字母一个字母的打印，打印完一个名字再换行
        public void output(String name) {
            int len = name.length();
            for (int i = 0; i < len; i++) {
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }

    public void init() {
        // 注意这里要申明为final
        final Outputer out = new Outputer();

        // 线程1：打印zhangsan
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    out.output("zhangsan");
                }
            }

        }).start();

        // 线程2：打印lisi
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    out.output("lisi");
                }
            }

        }).start();
    }

    public static void main(String[] args) {
        new TraditionalThreadSychronized().init();
    }
}

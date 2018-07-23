package net.thread;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread f = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread s = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(i);
                        }
                    }
                });
                s.start();
                System.out.println("************* son thread started *************");
                try {
                    s.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("************* son thread died *************");
            }
        });
        f.start();
        f.join();
        System.out.println("****************fa****************");
    }
}

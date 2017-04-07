package net.dzirt;

/**
 * Created by Андрей on 15.03.2017.
 */
public class JoinClass implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            if(!Thread.interrupted()) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException!");
                    System.err.println("Exception msg: " + e.getMessage());
                    return;
                }
            } else {
                System.out.println("Interrupted!");
                return;
            }
        }
    }
}

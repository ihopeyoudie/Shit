package net.dzirt;

public class TestClass {

    public static void main(String[] args) {
        Thread thread = new Thread(new JoinClass());
        thread.start();
        try {
            Thread.sleep(1000L); // выключаем поток main, чтобы в JoinClass.run() что-то успело посчитаться
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}

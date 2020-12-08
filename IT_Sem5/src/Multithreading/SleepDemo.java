package Multithreading;

public class SleepDemo extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        SleepDemo t1 = new SleepDemo();
        SleepDemo t2 = new SleepDemo();
        t1.start();
        t2.start();
    }
}

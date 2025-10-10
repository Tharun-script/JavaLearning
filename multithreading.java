class MyRunnable implements Runnable {
    public void run() {
        for(int j = 1; j <= 5; j++) {
            System.out.println("Runnable thread running: " + j);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread class running: " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Using Thread class
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();

        // Using Runnable interface
        MyRunnable r1 = new MyRunnable();
        Thread t11 = new Thread(r1);
        Thread t21 = new Thread(r1);
        t11.start();
        t21.start();
    }
}

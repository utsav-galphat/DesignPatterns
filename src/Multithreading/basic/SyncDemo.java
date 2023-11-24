package Multithreading.basic;

import java.util.concurrent.locks.ReentrantLock;

public class SyncDemo {
    public static void main(String[] args) {
        Display d = new Display();
        Display d2 = new Display();
//        MyThread t1 = new MyThread(d, "Dhoni");
//        MyThread t2 = new MyThread(d2, "Yuvi");
//        t1.start();
//        t2.start();

    }
}

class Display {

    public void wish(String msg) {
        System.out.println("Here Starts");
        synchronized (Display.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print(Thread.currentThread().getName() + "  -> Good Morning: ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.print(msg);
                System.out.println();
            }
        }
        System.out.println("Here End");

    }
}

class Calculate {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        MyThread b = new MyThread();
        ReentrantLock l = new ReentrantLock();
        b.start();
//        Thread.sleep(1000);
        synchronized (b) {
            System.out.println("main thread start");
            try {
                b.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("main thread get notification");
            System.out.println(b.n);
        }
    }
}

class MyThread extends Thread {
    Display d;
    String name;
    public int n = 0;
//    public MyThread(Display d, String name) {
//        this.d = d;
//        this.name = name;
//    }
//
//    public void run() {
//        d.wish(name);
//    }

    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

            System.out.println("child thread start");
            for (int i = 1; i <= 100; i++) {
                n = n + i;
            }
            System.out.println("child thread ends");
            this.notify();
        }
    }
}
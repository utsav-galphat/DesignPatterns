package Multithreading.concurrent.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DemoLock {
    public static void main(String[] args){
        Display d = new Display();
        MyThread1 t1 = new MyThread1(d, "Dhoni");
        MyThread1 t2 = new MyThread1(d, "Yuvi");
        t1.start();
        t2.start();

    }
}


class Display{
    ReentrantLock l = new ReentrantLock();
    public void with(String name) throws InterruptedException {
        //l.lock();
        if (l.tryLock(11, TimeUnit.SECONDS)){
            for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning: ");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }
            l.unlock();
        }
        else{
            System.out.println("Lock is not available");
        }
        //l.unlock();
    }
}
class MyThread1 extends Thread{
    Display d;
    String name;

    public MyThread1(Display d, String name ){
        this.name = name;
        this.d = d;
    }
    public void run(){
        try {
            d.with(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
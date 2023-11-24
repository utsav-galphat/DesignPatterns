package Multithreading.basic;

public class DemoThread {
    public static void main(String[] args) throws InterruptedException {
        AlphaNum d = new AlphaNum();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
//        Thread.currentThread().setPriority(3);
//
//        MyRunnable s = new MyRunnable();
//        Thread t = new Thread(s, "test-0");
//
//        System.out.println("Start 1 thread");
//        t.start();
//        System.out.println("Waiting for 1st thread");
//        t.join();
//        System.out.println("Main thread execution done");
    }
}
class MyRunnable implements Runnable{

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(i + " :" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

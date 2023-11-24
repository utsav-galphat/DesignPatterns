package Multithreading.basic;

public class Next extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public void run(int i ){
        System.out.println(i + "  " +Thread.currentThread().getName());
    }
}

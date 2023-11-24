package Multithreading.basic;

public class MyThread2 extends Thread {
    AlphaNum d;
    MyThread2(AlphaNum d){
        this.d = d;
    }
    public void run(){
        d.num();
    }
}

package Multithreading.basic;

public class MyThread1 extends Thread{
    AlphaNum d;
    MyThread1(AlphaNum d){
        this.d = d;
    }

    MyThread1(){

    }
    public void run(){
//        d.alpha();
        System.out.println("I am the Adder class");

    }
}

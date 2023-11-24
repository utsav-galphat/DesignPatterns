package Multithreading.basic;

import java.util.function.Function;

public class Sample implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());

        for(int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    static Function<String,Integer> f2 = String::length;


}

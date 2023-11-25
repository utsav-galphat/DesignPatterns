package Multithreading.Syncronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Adder ad = new Adder(counter);
        Subtract sb = new Subtract(counter);


        Thread td = new Thread(ad);
        Thread tb = new Thread(sb);

        td.start();
        tb.start();

        td.join();
        tb.join();
        System.out.println("Last value : " + counter.count);
    }
}

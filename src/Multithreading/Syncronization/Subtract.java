package Multithreading.Syncronization;

public class Subtract implements Runnable {

    final Counter counter;

    Subtract(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (counter) {
                counter.count -= i;
                System.out.println(counter.count);
            }
        }
    }
}

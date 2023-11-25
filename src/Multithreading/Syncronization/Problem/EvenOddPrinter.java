package Multithreading.Syncronization.Problem;

public class EvenOddPrinter  {
    private static final Object lock = new Object();
    private static int count = 1;
    private static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> printNumbers(true), "EvenThread");
        Thread oddThread = new Thread(() -> printNumbers(false), "OddThread");

        evenThread.start();
        oddThread.start();
    }

    private static void printNumbers(boolean isEven) {
        while (count <= MAX_COUNT) {
            synchronized (lock) {
                if ((count % 2 == 0 && isEven) || (count % 2 != 0 && !isEven)) {
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}

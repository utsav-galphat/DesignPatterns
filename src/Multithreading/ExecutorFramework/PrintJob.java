package Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintJob extends Thread {
    String name;

    PrintJob(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " is ended by " + Thread.currentThread().getName());

    }
}

class Demo{
    public static void main(String[] args) {
        PrintJob[] jobs = {new PrintJob("David"),
                new PrintJob("messi"),
                new PrintJob("Ronaldo"),
                new PrintJob("Gavi"),
                new PrintJob("Ronald"),
                new PrintJob("Pedri")};
        ThreadGroup tg = new ThreadGroup("test");
        ExecutorService service = Executors.newFixedThreadPool(3);

        for(PrintJob job : jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}

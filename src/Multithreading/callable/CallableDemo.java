package Multithreading.callable;

import java.util.List;
import java.util.concurrent.*;


// if you want call to return another type mention her Callable<Integer>
public class  CallableDemo implements Callable<String> {
    String name;

    CallableDemo(String name) {
        this.name = name;
    }

    public String call() {
        System.out.println(name + " is started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " is ended by " + Thread.currentThread().getName());
        return "return by " + Thread.currentThread().getName();
    }
}

class Demo{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableDemo[] jobs = {new CallableDemo("David"),
                new CallableDemo("messi"),
                new CallableDemo("Ronaldo"),
                new CallableDemo("Gavi"),
                new CallableDemo("Ronald"),
                new CallableDemo("Pedri")};
        ExecutorService service = Executors.newFixedThreadPool(4);

//        for(CallableDemo job : jobs) {
//            Future<String> s = service.submit(job);
//            System.out.println("print -> " + s.get());
//        }

        //a better way to do this
        List<Future<String>> futureList = service.invokeAll(List.of(jobs));

        for(Future<String> future: futureList){
            System.out.println("print -> " + future.get());
        }


        service.shutdown();
    }
}

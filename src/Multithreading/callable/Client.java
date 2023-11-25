package Multithreading.callable;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Client{

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // ExecutorService executorService = Executors.newFixedThreadPool(1);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayCreator ar = new ArrayCreator(n);


        // Future<ArrayList> ar = executorService.submit(ar);

        FutureTask<ArrayList<Integer>> ft = new FutureTask<>(ar);
        Thread thread = new Thread(ft);
        thread.start();

        System.out.println(ft.get());
        // executorService.shutdown();
    }
}
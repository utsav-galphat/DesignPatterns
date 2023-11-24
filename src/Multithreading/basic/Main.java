package Multithreading.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
    }
}

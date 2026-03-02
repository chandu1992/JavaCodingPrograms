package com.jarvis.java8.Features.MultiThreading;

public class MainThread {
    public static void main(String[] args) {

//        Runnable r = new CreateThreadNormal();
//        Thread t = new Thread(r);
//        t.start();

//        for (int i=0;i<5;i++){
//            System.out.println("Main thread");
//        }

//        =====================

        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("New Thread");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        for (int i=0;i<5;i++){
            System.out.println("Main thread");
        }
    }
}

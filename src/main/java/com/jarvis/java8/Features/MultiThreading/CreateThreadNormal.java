package com.jarvis.java8.Features.MultiThreading;

public class CreateThreadNormal implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("Runnable thread");
        }
    }
}


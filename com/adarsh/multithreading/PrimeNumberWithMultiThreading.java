package com.adarsh.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberWithMultiThreading {

    public static void main(String args[]){

//        int number=0;

        List<Thread> threads = new ArrayList<>();

        Runnable statusReporter = new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {

                        Thread.sleep(10000);
                        printThreads(threads);
                    }
                }
                catch (InterruptedException e) {
                    System.out.println("Status Report Thread INter rupted : Ending Status updated");
                }
            }
        };

        Thread reportedThread = new Thread(statusReporter);
        reportedThread.setDaemon(true);
        reportedThread.start();


        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("\n I can tell you the nth price number . Enter n: ");
            int n=sc.nextInt();
            if(n==0){
                reportedThread.interrupt();
                try {
                    waitForThreads(threads);
                } catch (InterruptedException e) {
                    System.out.println("\n Get INterrupted when waiting for Threads");
                }
                break;
            }
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    int num = PrimeNumberUtil.calculatePrime(n);
                    System.out.println("\n Result : ");
                    System.out.println("\n Value of "+ n + "th prime is "+num);
                }
            };
            Thread t=new Thread(r);
            threads.add(t);
//            t.setDaemon(true);
            t.start();
        }
    }

    private static void waitForThreads(List<Thread> threads) throws InterruptedException {
        for(Thread thread : threads){
            if(!thread.getState().equals(Thread.State.TERMINATED)){
                System.out.println("inside Terminated");
                thread.join();
            }
        }
    }

    private static void printThreads(List<Thread> threads) {
           System.out.println("\n Thread Status");
           threads.forEach( thread -> {
               System.out.print(thread.getState()+" ");
           });
           System.out.println("");
    }
}

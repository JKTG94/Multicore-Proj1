package com.company;

public class Main {
    public static int NUM_END = 200000;
    public static int nThread = 1;

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        int i;

        PrimeThread[] p = new PrimeThread[nThread];


        long startTime = System.currentTimeMillis();
        //thread start
        for(i = 0; i < nThread; i++){
            p[i] = new PrimeThread();
            p[i].start();
        }
        for(i = 0; i < nThread; i++){
            p[i].join();
            System.out.println("Thread " + i + " Prime count : " + p[i].counter);
        }

        long endTime= System.currentTimeMillis();
        long timeDiff = endTime - startTime;

        System.out.println("Execution Time : " + timeDiff + "ms");
    }
}

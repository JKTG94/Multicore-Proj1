package com.company;
import static com.company.Main.NUM_END;
import static com.company.Main.nThread;

public class PrimeThread extends Thread{
    public static int counter = 0;

    public void run(){
        for(int i = 0; i < NUM_END; i ++){
            if(isPrime(i)) counter++;
        }
    }

    private static boolean isPrime(int x) {
        int i;
        if(x <= 1) return false;
        for(i = 2; i < x; i++){
            if((x % i == 0) && (i != x)) return false;
        }
        return true;
    }
}

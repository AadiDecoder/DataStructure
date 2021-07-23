package com.adarsh.multithreading;

public class PrimeNumberUtil {
    public static int calculatePrime(int n) {
       int number;
       int numberOfPrimesFound;
       int i;
       number=1;
        numberOfPrimesFound=0;
        while( n>numberOfPrimesFound ){
            number++;
//            System.out.println( number );
            for(i=2; i<=number && number % i !=0 ; i++){
            }
            if( i==number ){
//                System.out.println( i +" "+ number );
                numberOfPrimesFound++;
            }
        }
        return number;

    }
}

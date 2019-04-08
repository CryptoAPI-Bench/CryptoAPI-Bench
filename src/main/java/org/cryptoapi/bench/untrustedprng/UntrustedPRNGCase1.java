package org.cryptoapi.bench.untrustedprng;

import java.util.Random;

public class UntrustedPRNGCase1 {
    public static void main(String [] args)
    {
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt();
        System.out.println(x);
    }



}

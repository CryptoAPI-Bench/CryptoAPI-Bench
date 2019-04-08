package org.cryptoapi.bench.predictableseeds;

import java.security.SecureRandom;

public class PredictableSeedsABICase6 {
    public static void main (String [] args){
        byte seed = 100;
        method1(seed);
    }
    public static void method1(byte s) {
        byte seed2 = s;
        method2(seed2);
    }

    private static void method2(byte seed) {
        SecureRandom sr = new SecureRandom(new byte[]{seed});
        int v = sr.nextInt();
        System.out.println(v);
    }
}

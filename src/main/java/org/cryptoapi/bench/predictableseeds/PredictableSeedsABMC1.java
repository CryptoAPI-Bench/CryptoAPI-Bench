package org.cryptoapi.bench.predictableseeds;

import java.security.SecureRandom;

public class PredictableSeedsABMC1 {
    public void go(byte[] seed) {
        SecureRandom sr = new SecureRandom();
        sr.setSeed(seed);
        int v = sr.nextInt();
        System.out.println(v);
    }
}

package org.cryptoapi.bench.predictableseeds;

import java.security.SecureRandom;

public class PredictableSeedsABMC2 {
    public void go(byte seed) {
        SecureRandom sr = new SecureRandom(new byte[]{seed});
        int v = sr.nextInt();
        System.out.println(v);
    }
}

package org.cryptoapi.bench.pbeiteration;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class LessThan1000IterationPBEABMC1 {
    public void go(int count) {
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);

        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}

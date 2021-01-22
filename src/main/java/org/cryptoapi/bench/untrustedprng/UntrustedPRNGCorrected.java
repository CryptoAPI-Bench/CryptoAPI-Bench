package org.cryptoapi.bench.untrustedprng;

import java.security.SecureRandom;
import javax.crypto.spec.PBEParameterSpec;

public class UntrustedPRNGCorrected {


    public static void main(String [] args)
    {
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
        int count = 10020;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}

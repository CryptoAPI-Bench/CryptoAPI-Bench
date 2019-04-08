package org.cryptoapi.bench.untrustedprng;

import java.security.SecureRandom;

public class UntrustedPRNGCorrected {


    public static void main(String [] args)
    {
        SecureRandom random = new SecureRandom();
        int x = random.nextInt();
        System.out.println(x);
    }
}

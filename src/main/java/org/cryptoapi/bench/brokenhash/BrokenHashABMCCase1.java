package org.cryptoapi.bench.brokenhash;

import java.security.NoSuchAlgorithmException;

public class BrokenHashABMCCase1 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
        BrokenHashABMC1 bh = new BrokenHashABMC1();
        String str = "abcdef";
        String crypto = "SHA1";
        bh.go(str,crypto);
    }
}

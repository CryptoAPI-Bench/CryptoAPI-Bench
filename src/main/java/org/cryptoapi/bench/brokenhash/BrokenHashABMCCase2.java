package org.cryptoapi.bench.brokenhash;

import java.security.NoSuchAlgorithmException;

public class BrokenHashABMCCase2 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
        BrokenHashABMC2 bh = new BrokenHashABMC2();
        String str = "abcdef";
        String crypto = "MD5";
        bh.go(str,crypto);
    }
}

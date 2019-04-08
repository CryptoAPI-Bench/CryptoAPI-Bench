package org.cryptoapi.bench.brokenhash;

import java.security.NoSuchAlgorithmException;

public class BrokenHashABMCCase4 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
        BrokenHashABMC4 bh = new BrokenHashABMC4();
        String str = "abcdef";
        String crypto = "MD2";
        bh.go(str,crypto);
    }
}

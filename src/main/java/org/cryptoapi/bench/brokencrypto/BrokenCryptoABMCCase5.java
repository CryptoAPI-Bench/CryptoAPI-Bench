package org.cryptoapi.bench.brokencrypto;

import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMCCase5 {
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        BrokenCryptoABMC5 bc = new BrokenCryptoABMC5();
        String crypto = "IDEA";
        bc.go(crypto);
    }
}

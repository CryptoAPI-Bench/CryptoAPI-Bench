package org.cryptoapi.bench.brokencrypto;


import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMCCase3 {
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        BrokenCryptoABMC3 bc = new BrokenCryptoABMC3();
        String crypto = "RC4";
        bc.go(crypto);
    }
}

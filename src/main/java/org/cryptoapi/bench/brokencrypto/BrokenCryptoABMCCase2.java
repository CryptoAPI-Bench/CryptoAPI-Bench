package org.cryptoapi.bench.brokencrypto;

import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMCCase2 {
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        BrokenCryptoABMC2 bc = new BrokenCryptoABMC2();
        String crypto = "Blowfish";
        bc.go(crypto);
    }
}

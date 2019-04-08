package org.cryptoapi.bench.brokencrypto;

import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMCCase4 {
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        BrokenCryptoABMC4 bc = new BrokenCryptoABMC4();
        String crypto = "RC2";
        bc.go(crypto);
    }
}

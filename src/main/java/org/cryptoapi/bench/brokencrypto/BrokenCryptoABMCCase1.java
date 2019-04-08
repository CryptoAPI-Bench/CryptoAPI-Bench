package org.cryptoapi.bench.brokencrypto;

import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMCCase1 {
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        BrokenCryptoABMC1 bc = new BrokenCryptoABMC1();
        String crypto = "DES/ECB/PKCS5Padding";
        String cryptokey = "DES";
        bc.go(crypto,cryptokey);
    }
}

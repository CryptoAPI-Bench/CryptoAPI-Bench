package org.cryptoapi.bench.ecbcrypto;

import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbInSymmCryptoABMCCase1 {
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        EcbInSymmCryptoABMC1 bc = new EcbInSymmCryptoABMC1();
        String crypto = "AES/ECB/PKCS5Padding";
        bc.go(crypto);
    }
}

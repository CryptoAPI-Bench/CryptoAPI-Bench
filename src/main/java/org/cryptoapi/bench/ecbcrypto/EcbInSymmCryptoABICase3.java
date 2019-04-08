package org.cryptoapi.bench.ecbcrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbInSymmCryptoABICase3 {
    public static void method2(String c) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String cryptoAlgo = c;
        method1(cryptoAlgo);
    }
    public static void method1(String crypto) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(crypto);
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String crypto = "AES/ECB/PKCS5Padding";
        method2(crypto);
    }
}

package org.cryptoapi.bench.staticinitializationvector;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class StaticInitializationVectorABPSCase1 {
    public void go(int choice) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecureRandom sr = new SecureRandom();

        byte [] bytes = "abcde".getBytes();

        if(choice>1){
            bytes = new byte[16];
            sr.nextBytes(bytes);
        }

        IvParameterSpec ivSpec = new IvParameterSpec(bytes);

        cipher.init(Cipher.ENCRYPT_MODE,key,ivSpec);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        StaticInitializationVectorABPSCase1 siv = new StaticInitializationVectorABPSCase1();
        int choice = 2;
        siv.go(choice);
    }

}

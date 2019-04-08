package org.cryptoapi.bench.insecureasymmetriccrypto;

import javax.crypto.*;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class InsecureAsymmetricCipherABICase3 {
    public static void method2(int k) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        int keySize = k;
        method1(keySize);
    }

    public static void method1(int key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {

        KeyPairGenerator kgp = KeyPairGenerator.getInstance("RSA");
        kgp.initialize(key);
        KeyPair kp = kgp.generateKeyPair();


        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, kp.getPublic());

        //encrypting
        String myMessage = new String("Secret Message");
        SealedObject encryptedMessage = new SealedObject(myMessage,cipher);

        //decrypting
        Cipher dec = Cipher.getInstance("RSA");
        dec.init(Cipher.DECRYPT_MODE, kp.getPrivate());

        String message = (String) encryptedMessage.getObject(dec);
        System.out.println(message);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        int key = 1024;
        method2(key);


    }
}

package org.cryptoapi.bench.insecureasymmetriccrypto;
import javax.crypto.*;
import java.io.IOException;
import java.security.*;

public class InsecureAsymmetricCipherABPSCase1 {
    public void go(int choice) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        KeyPairGenerator kgp = KeyPairGenerator.getInstance("RSA");

        int keysize;
        if (choice>1)
            keysize = 2048;
        else
            keysize = 1024;

        kgp.initialize(keysize);
        KeyPair kp = kgp.generateKeyPair();


        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, kp.getPublic());

        //encrypting
        String myMessage = new String("Secret Message");
        SealedObject encryptedMessage = new SealedObject(myMessage,cipher);

        System.out.println(encryptedMessage);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        InsecureAsymmetricCipherABPSCase1 bc = new InsecureAsymmetricCipherABPSCase1();
        int choice = 2;
        bc.go(choice);
    }
}

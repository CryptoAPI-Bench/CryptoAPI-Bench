package org.cryptoapi.bench.insecureasymmetriccrypto;

import javax.crypto.*;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class InsecureAsymmetricCipherABMC1 {
    public void go(int keySize) throws IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {

        KeyPairGenerator kgp = KeyPairGenerator.getInstance("RSA");
        kgp.initialize(keySize);
        KeyPair kp = kgp.generateKeyPair();
        Cipher cipher = Cipher.getInstance("RSA");
        Cipher dec = Cipher.getInstance("RSA");

        cipher.init(Cipher.ENCRYPT_MODE, kp.getPublic());

        //encrypting
        String myMessage = new String("Secret Message");
        SealedObject encryptedMessage = new SealedObject(myMessage,cipher);

        //decrypting
        dec.init(Cipher.DECRYPT_MODE, kp.getPrivate());

        String message = (String) encryptedMessage.getObject(dec);
        System.out.println(message);
    }
}

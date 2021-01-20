package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

public class PredictableCryptographicKeyCorrected {
    public static void main(String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        SecureRandom random = new SecureRandom();
        byte [] keyBytes = new byte[16];
        random.nextBytes(keyBytes);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");

        String originalString = "Testing";
        
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        String encrypt = Base64.getEncoder().encodeToString(cipher.doFinal(originalString.getBytes("UTF-8")));
        System.out.println(encrypt);

    }
}

package org.cryptoapi.bench.credentialinstring;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.security.SecureRandom;

public class CredentialInStringABSCase1 {
    Crypto crypto;
    public CredentialInStringABSCase1() throws NoSuchAlgorithmException, NoSuchPaddingException {
        String passKey = CredentialInStringABSCase1.getKey("pass.key");

        if(passKey == null) {
            SecureRandom random = new SecureRandom();
            String defaultKey = String.valueOf(random.ints());
            crypto = new Crypto(defaultKey);
        }
        crypto = new Crypto(passKey);
    }

    byte[] encryptPass(String pass, String src) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException, UnsupportedEncodingException {
        String keyStr = CredentialInStringABSCase1.getKey(src);
        return crypto.method1(pass, keyStr);
    }

    public static String getKey(String s) {
        return System.getProperty(s);
    }
}

class Crypto {
    Cipher cipher;
    String algoSpec = "AES/CBC/PKCS5Padding";
    String algo = "AES";
    String defaultKey;
    public Crypto(String defkey) throws NoSuchPaddingException, NoSuchAlgorithmException {
        cipher = Cipher.getInstance(algoSpec);
        defaultKey = defkey;
    }

    public byte[] method1(String txt, String key) throws UnsupportedEncodingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        if(key.isEmpty()){
            key = defaultKey;
        }
        byte[] keyBytes = key.getBytes("UTF-8");
        byte [] txtBytes = txt.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);

        SecretKeySpec keySpec = new SecretKeySpec(keyBytes,algo);
        cipher.init(Cipher.ENCRYPT_MODE,keySpec);
        return cipher.doFinal(txtBytes);
    }
}
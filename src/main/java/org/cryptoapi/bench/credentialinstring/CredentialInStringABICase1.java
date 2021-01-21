package org.cryptoapi.bench.credentialinstring;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class CredentialInStringABICase1 {
    public static void main(String [] args){
        SecureRandom random = new SecureRandom();
		String key = String.valueOf(random.ints());
        go(key);
    }

    private static void go(String key) {
        byte[] keyBytes = key.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}
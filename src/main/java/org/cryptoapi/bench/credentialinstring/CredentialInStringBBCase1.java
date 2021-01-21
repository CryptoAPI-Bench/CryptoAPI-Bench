package org.cryptoapi.bench.credentialinstring;

import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Arrays;

public class CredentialInStringBBCase1 {
    public static void main(String [] args){
        String defaultKey = "SecDev2020";
        byte[] keyBytes = defaultKey.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}
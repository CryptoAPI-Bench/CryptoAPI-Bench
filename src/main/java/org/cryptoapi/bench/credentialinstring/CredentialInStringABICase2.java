package org.cryptoapi.bench.credentialinstring;

import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Arrays;

public class CredentialInStringABICase2 {
    public static byte [] DEFAULT_ENCRYPT_KEY = {20,10,30,5,5,6,8,7};
    private static byte[] ENCRYPT_KEY;
    private static byte[] encryptKey;
    public static void main(String [] args){
        go2();
        go3();
        go();
    }

    private static void go2(){
        ENCRYPT_KEY = DEFAULT_ENCRYPT_KEY;
    }
    private static void go3(){
        encryptKey = ENCRYPT_KEY;
    }

    private static void go() {
        byte[] keyBytes = encryptKey;
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}

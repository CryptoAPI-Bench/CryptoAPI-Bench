package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class PredictableCryptographicKeyABICase1 {
    public static void main(String [] args){
        byte key[] = {20,10,30,5,5,6,8,7};
        go(key);
    }

    
    private static void go(byte [] keyBytes) {
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}

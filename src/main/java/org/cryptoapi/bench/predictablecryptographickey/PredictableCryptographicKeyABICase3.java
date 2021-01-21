package org.cryptoapi.bench.predictablecryptographickey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class PredictableCryptographicKeyABICase3 {
    public static void main(String [] args){
        byte key[] = {20,10,30,5,5,6,8,7};
        method1(key);
    }
    
    public static void method1(byte [] k){
        method2(k);
    }

    private static void method2(byte [] key) {
        byte[] keyBytes = key;
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}

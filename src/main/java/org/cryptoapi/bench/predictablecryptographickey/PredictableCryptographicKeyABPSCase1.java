package org.cryptoapi.bench.predictablecryptographickey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Arrays;

public class PredictableCryptographicKeyABPSCase1 {
    public static void main(String [] args){
        String defaultKey = "defaultkey";
        int choice = 2;
        byte[] keyBytes = defaultKey.getBytes();

        if(choice>1){
            SecureRandom random = new SecureRandom();
            random.nextBytes(keyBytes);
        }
        
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }

}

package org.cryptoapi.bench.predictablepbepassword;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PredictablePBEPasswordABPSCase1 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public static void main(String [] args){
        PredictablePBEPasswordABPSCase1 ckp = new PredictablePBEPasswordABPSCase1();
        int choice=2;
        ckp.key(choice);
    }
    public void key(int choice) {
        String defaultKey = "saagar";
        if (choice>1){
            SecureRandom random = new SecureRandom();
            defaultKey = String.valueOf(random.ints());
        }
        byte [] salt = new byte[16];
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(salt);
        int iterationCount = 11010;
        int keyLength = 16;
        pbeKeySpec = new PBEKeySpec(defaultKey.toCharArray(),salt,iterationCount,keyLength);
    }
}

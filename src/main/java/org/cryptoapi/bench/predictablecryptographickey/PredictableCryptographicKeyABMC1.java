package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;


public class PredictableCryptographicKeyABMC1 {
    public void go(byte [] key) {
        byte [] keyBytes;
        keyBytes = Arrays.copyOf(key,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}

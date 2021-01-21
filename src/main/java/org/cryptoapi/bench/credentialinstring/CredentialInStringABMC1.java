package org.cryptoapi.bench.credentialinstring;

import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class CredentialInStringABMC1 {
    public void go(String key) {
        byte[] keyBytes = key.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}
package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PredictableCryptographicKeyABHCase2 {
    public static void main(String [] args) throws UnsupportedEncodingException {

        Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("aaa", 32);
        hm.put("bbb", 33);
        byte [] key;
        int idx = hm.get("aaa");
        if (idx == 32) {
            key = {20,10,30,5,5,6,8,7};
        } else {
            key = {20,10,30,5,5,6,8,7};
        }

        byte [] keyBytes = key.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}

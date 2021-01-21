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
        byte [] key = new byte [5];
        int idx = hm.get("aaa");
        if (idx == 32) {
            key[0] = 20;
	    key[1] = 30;
            key[2] = 40;
            key[3] = 50;
            key[4] = 10;
        } else {
            key[0] = 25;
	    key[1] = 35;
            key[2] = 45;
            key[3] = 55;
            key[4] = 15;
        }

        byte [] keyBytes = key;
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}

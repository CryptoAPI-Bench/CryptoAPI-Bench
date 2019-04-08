package org.cryptoapi.bench.predictableseeds;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PredictableSeedsABSCase1 {
    CryptoPredictableSeed1 crypto;
    public PredictableSeedsABSCase1() throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, UnsupportedEncodingException {

        //long seed = 456789L;
        byte [] seed = {(byte) 100, (byte) 200};
        crypto = new CryptoPredictableSeed1(seed);
        crypto.method1(new byte[]{(byte)0, (byte)0});
    }
}

class CryptoPredictableSeed1 {
    byte [] defSeed;

    public CryptoPredictableSeed1(byte [] seed) throws NoSuchPaddingException, NoSuchAlgorithmException {
        defSeed = seed;
    }

    public void method1(byte [] passedSeed) throws UnsupportedEncodingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException {

        passedSeed = defSeed;

        SecureRandom sr = new SecureRandom();
        sr.setSeed(passedSeed);
        int v = sr.nextInt();
        System.out.println(v);
    }
}
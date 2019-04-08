package org.cryptoapi.bench.pbeiteration;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class LessThan1000IterationPBEABICase1 {

    public static void main(){
        LessThan1000IterationPBEABICase1 lt = new LessThan1000IterationPBEABICase1();
        int count = 20;
        lt.go(count);
    }
    public void go(int count){
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);

        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}

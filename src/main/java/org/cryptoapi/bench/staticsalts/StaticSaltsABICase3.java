package org.cryptoapi.bench.staticsalts;

import javax.crypto.spec.PBEParameterSpec;

public class StaticSaltsABICase3 {
    public static void main(String [] args){
        byte[] salt = {(byte) 0xa2};
        int count = 1020;
        method1(salt,count);
    }
    public static void method1(byte[] s, int c){
        int count2 = c;
        method2(s,count2);
    }

    public static void method2(byte[] salt, int count){
        PBEParameterSpec pbeParamSpec = null;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}

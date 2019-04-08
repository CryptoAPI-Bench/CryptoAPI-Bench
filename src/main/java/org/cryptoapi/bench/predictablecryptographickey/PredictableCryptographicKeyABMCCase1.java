package org.cryptoapi.bench.predictablecryptographickey;

public class PredictableCryptographicKeyABMCCase1 {
    public static void main(String [] args){
        PredictableCryptographicKeyABMC1 pc = new PredictableCryptographicKeyABMC1();
        String key = "defaultkey";
        pc.go(key);
    }
}

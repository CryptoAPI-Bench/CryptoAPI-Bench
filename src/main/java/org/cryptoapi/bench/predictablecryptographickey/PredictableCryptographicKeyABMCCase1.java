package org.cryptoapi.bench.predictablecryptographickey;

public class PredictableCryptographicKeyABMCCase1 {
    public static void main(String [] args){
        PredictableCryptographicKeyABMC1 pc = new PredictableCryptographicKeyABMC1();
        byte key[] = {20,10,30,5,5,6,8,7};
        pc.go(key);
    }
}

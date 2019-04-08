package org.cryptoapi.bench.predictableseeds;

public class PredictableSeedsABMCCase1 {
    public static void main (String [] args){
        //long seed = 456789L;
        PredictableSeedsABMC1 ps = new PredictableSeedsABMC1();
        byte [] seed = {(byte) 100, (byte) 200};
        ps.go(seed);
    }
}

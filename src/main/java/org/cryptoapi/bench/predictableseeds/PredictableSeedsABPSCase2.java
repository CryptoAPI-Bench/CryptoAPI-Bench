package org.cryptoapi.bench.predictableseeds;
import java.security.SecureRandom;

public class PredictableSeedsABPSCase2 {
    public static void main (String [] args){
        SecureRandom sr2 = new SecureRandom();
        int choice=2;
        byte [] seed = {(byte) 100, (byte) 200};
        if(choice>1)
            sr2.nextBytes(seed);

        //byte seed = 100;
        //SecureRandom sr = new SecureRandom(new byte[]{seed});
        SecureRandom sr = new SecureRandom(seed);
        int v = sr.nextInt();
        System.out.println(v);
    }
}

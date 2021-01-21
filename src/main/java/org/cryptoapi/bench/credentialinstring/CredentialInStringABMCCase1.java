package org.cryptoapi.bench.credentialinstring;

import java.security.SecureRandom;

public class CredentialInStringABMCCase1 {
    public static void main(String [] args){
        CredentialInStringABMC1 pc = new CredentialInStringABMC1();
        SecureRandom random = new SecureRandom();
        String key = String.valueOf(random.ints());
        pc.go(key);
    }
}
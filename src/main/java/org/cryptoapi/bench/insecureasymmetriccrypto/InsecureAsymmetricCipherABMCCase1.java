package org.cryptoapi.bench.insecureasymmetriccrypto;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class InsecureAsymmetricCipherABMCCase1 {
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        InsecureAsymmetricCipherABMC1 bc = new InsecureAsymmetricCipherABMC1();
        int keySize = 1024;

        bc.go(keySize);
    }
}

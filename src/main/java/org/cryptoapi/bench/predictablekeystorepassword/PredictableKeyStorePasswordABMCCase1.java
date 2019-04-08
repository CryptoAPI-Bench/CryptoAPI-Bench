package org.cryptoapi.bench.predictablekeystorepassword;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class PredictableKeyStorePasswordABMCCase1 {
    public static void main(String args[]) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        PredictableKeyStorePasswordABMC1 pksp = new PredictableKeyStorePasswordABMC1();
        String key = "changeit";
        pksp.go(key);
    }
}

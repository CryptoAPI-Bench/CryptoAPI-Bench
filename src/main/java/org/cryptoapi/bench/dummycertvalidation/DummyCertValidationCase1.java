package org.cryptoapi.bench.dummycertvalidation;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class DummyCertValidationCase1 implements X509TrustManager {
    private X509TrustManager trustManager;
    @Override
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        //Trust any client connecting (no certificate validation)
        trustManager.checkClientTrusted(x509Certificates,s);
    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        //Trust any remote server (no certificate validation)

    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {

        //return null;
        return new X509Certificate[0];
    }
}

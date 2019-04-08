package org.cryptoapi.bench.dummyhostnameverifier;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public class DummyHostNameVerifierCorrected implements HostnameVerifier {
    public boolean verify(String hostname, SSLSession sslSession) {
        if ("192.168.0.10".equals(hostname)) {
            return true;
        } else {
            HostnameVerifier hv = HttpsURLConnection.getDefaultHostnameVerifier();
            return hv.verify(hostname, sslSession);
        }
    }
}

package org.cryptoapi.bench.http;

import java.net.URL;

public class HttpProtocolCase1Corrected {
    public static void main(String[] args) throws Exception {
        String url = "https://www.google.com";
        System.out.println(new URL(url));
    }
}

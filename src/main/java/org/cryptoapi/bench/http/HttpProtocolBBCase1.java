package org.cryptoapi.bench.http;

import java.net.URL;

public class HttpProtocolBBCase1 {
    public static void main(String[] args) throws Exception {
        String url = "http://www.facebook.com";
        System.out.println(new URL(url));
    }
}

package org.cryptoapi.bench.http;

import java.net.MalformedURLException;
import java.net.URL;

public class HttpProtocolCase2Corrected {

    public static void main(String [] args) throws MalformedURLException {
        String url = "https://www.google.com";
        go(url);

    }

    private static void go(String url) throws MalformedURLException {
        System.out.println(new URL(url));
    }

}

package org.cryptoapi.bench.http;
import java.net.MalformedURLException;
import java.net.URL;


public class HttpProtocolABICase3 {
    public static void main(String [] args) throws MalformedURLException {
        String url = "http://www.google.com";
        method1(url);
    }

    private static void method1 (String url) throws MalformedURLException {
        String url2 = url;
        method2(url2);
    }

    private static void method2(String url) throws MalformedURLException {
        System.out.println(new URL(url));
    }
}

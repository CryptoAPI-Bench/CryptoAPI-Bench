package org.cryptoapi.bench.http;
import java.net.URL;

public class HttpProtocolABPSCase1 {
    public static void main(String[] args) throws Exception {
        int choice = 2;
        String url = "http://www.facebook.com";
        if(choice>1)
            url = "https://www.google.com";
        System.out.println(new URL(url));
    }
}

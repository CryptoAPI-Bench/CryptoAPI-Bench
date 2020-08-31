package org.cryptoapi.bench.http;

import java.net.URL;

public class HttpProtocolBBCase1 {
    public static void main(String[] args) throws Exception {
        String url = "http://insects.myspecies.info/";
        System.out.println(new URL(url));
    }
}

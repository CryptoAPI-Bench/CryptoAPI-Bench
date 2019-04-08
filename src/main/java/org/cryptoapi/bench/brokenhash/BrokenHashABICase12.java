package org.cryptoapi.bench.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashABICase12 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
        String str = "abcdef";
        String crypto = "MD2";
        method2(str,crypto);
    }
    public static void method2 (String s, String cryptoHash) throws NoSuchAlgorithmException {
        String str2 = s;
        String hashAlgo = cryptoHash;
        method1(str2,hashAlgo);
    }
    public static void method1 (String str, String crypto) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(crypto);
        md.update(str.getBytes());
        System.out.println(md.digest());
    }
}

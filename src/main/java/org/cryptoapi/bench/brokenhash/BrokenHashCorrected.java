package org.cryptoapi.bench.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashCorrected {
    public static void main (String [] args) {
        try {
            String name = "abcdef";
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(name.getBytes());
            System.out.println(md.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

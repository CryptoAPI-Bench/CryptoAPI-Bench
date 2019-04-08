package org.cryptoapi.bench.brokenhash;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashABPSCase1 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
        String name = "abcdef";
        int choice = 2;
        MessageDigest md = MessageDigest.getInstance("SHA1");
        if(choice>1)
            md = MessageDigest.getInstance("SHA-256");
        md.update(name.getBytes());
        System.out.println(md.digest());
    }
}

package Algorithms.SHA1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("Enter string");
        Scanner inputOrigin = new Scanner(System.in);
        String origin = inputOrigin.nextLine();
        String SHA1=encrypted(origin);
        System.out.println(SHA1);
    }

    private static String encrypted(String origin) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(origin.getBytes());

        byte[] digest = md.digest();
        StringBuilder result = new StringBuilder();
        for (byte b : digest) {
            result.append(String.format("%02X ", b));
            result.append(" ");
        }
        return result.toString();
    }

}

package Algorithms.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("Enter string");
        Scanner inputOrigin = new Scanner(System.in);
        String origin = inputOrigin.nextLine();
        String MD5=encrypted(origin);
        System.out.println(MD5);
    }

    private static String encrypted(String origin) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
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

package Algorithms.RSA;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class RSA {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner inputOrigin = new Scanner(System.in);
        String origin = inputOrigin.nextLine();
        byte[] RSA=encryption(origin);
        System.out.println(bytesToString(RSA));

    }

    private static byte[] encryption(String origin) {
        int  bitlength = 1024;
        Random  r = new Random();
        BigInteger p = BigInteger.probablePrime(bitlength,r);
        BigInteger q = BigInteger.probablePrime(bitlength,r);
        BigInteger d;
        BigInteger N;
        BigInteger phi;
        BigInteger e;
        N = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitlength / 2, r);
        while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0)
        {
           e= e.add(BigInteger.ONE);
        }
        d = e.modInverse(phi);
        return (new BigInteger(origin.getBytes())).modPow(e, N).toByteArray();
    }
    private static String bytesToString(byte[] encrypted) {

        StringBuilder origin = new StringBuilder();

        for (byte b : encrypted) {

            origin.append(b);

        }

        return origin.toString();

    }
}

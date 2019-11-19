package Algorithms.RSA;

import java.util.Scanner;

public class RSA {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner inputOrigin = new Scanner(System.in);
        String origin = inputOrigin.nextLine();
        System.out.println("Enter firstKey");
        Scanner inputFirstKey= new Scanner(System.in);
        int p = inputFirstKey.nextInt();
        System.out.println("Enter secondKey");
        Scanner inputSecondKey = new Scanner(System.in);
        int q = inputSecondKey.nextInt();
        int RSA=decryption(origin,p,q);
        System.out.println(RSA);

    }

    private static int decryption(String origin, int p, int q) {
        int c;
        int n=p*q;
        int x=(p-1)*(q-1);
        int e;
        for (e=2;e<x;e++){
            if (gcd(x,e)==1){break;}
        }
        int d;
        for (int i=0;i<9;i++){
            int y=1+(i*x);
            if (y%e==0){
                d=y/e;break;
            }
        }
        c= (int) ((Math.pow(Double.parseDouble(origin),e))%n);
        return c;
    }

    private static int gcd(int x, int e) {
        if (e==0) return e;
        return gcd(x%e,e);
    }
}

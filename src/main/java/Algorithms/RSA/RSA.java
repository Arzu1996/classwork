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
        int RSA=decrypt(origin,p,q);
        System.out.println(RSA);

    }

    private static int decrypt(String origin, int p, int q) {
    int c;
        int n=p*q;
        int x=(p-1)*(q-1);
        int e;
        for (e=0;e<x;e++){
            if (gcd(e,x)==1){break;}
        }
        int d;
        for (d=0;d<x;d++){
            if (e*d%x==1){break;}
        }
c= (int) ((Math.pow(Double.parseDouble(origin),e))%n);
        return c;
    }

    private static int gcd(int e, int x) {
        if (x==0) return x;
        return gcd(e,x%e);
    }
}

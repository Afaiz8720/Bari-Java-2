package Metthod;

import java.util.*;
public class gcd {

    static int Gcd(int m , int n){
        while (m != n) {
            if (m > n) {
                m = m - n ;
            } else {
                n = n - m ;
            }
        }
        return m ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a m number : ");
        int m = sc.nextInt();
        System.out.println("Enter a n number : ");
        int n = sc.nextInt();

        System.out.println("GCD is " + Gcd(m, n));
    }
}

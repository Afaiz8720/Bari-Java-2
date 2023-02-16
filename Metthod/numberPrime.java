package Metthod;
import java.util.*;
public class numberPrime {

    static boolean isPrimeNumber(int number){
        for (int i = 2 ; i < number / 2  ; i++) {
            if(number % i == 0){
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        boolean ans = isPrimeNumber(number);

        if(ans){
            System.out.println(number + " is prime number");
        } 
        else{
            System.out.println(number + " is not prime number");
        }
        sc.close();
    }
}

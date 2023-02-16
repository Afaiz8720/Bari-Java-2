package Metthod.overloading.challenge;

import java.util.*;
public class reverseOverloading {

    static int reverse(int number){
        int rev = 0 ;
        while(number != 0){
            int rem = number % 10 ;
            rev = (rev * 10) + rem ;
            number /= 10 ;
        }
        return rev ;
   }

   static void reverse(int arr[]){
        int n = arr.length - 1 ;

        System.out.println("\nArray After reversing");
        for (int i = n ; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 3 , 1 , 5 , 2 , 8 };
        
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("\nReverse number is : " + reverse(number));

        System.out.println("\nArray before reversing");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        reverse(arr);
    }
}

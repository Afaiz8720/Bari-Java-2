package Metthod.overloading.challenge;

import java.util.*;
public class validateNameAndAge {

    static boolean validateName(String name){
        if(name.matches("[A-Za-z]+")){
            return true ;
        }
        return false ;
    }

    static boolean validateAge(int age){
        if(age >= 14 || age <= 55){
            return true ;
        }
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();

        System.out.println("This is valid name : " + validateName(name));

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.println("This is valid age : " + validateAge(age));
    }


}

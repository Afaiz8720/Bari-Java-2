package Metthod.overloading.challenge;

import java.util.*;
public class areaOverloding {

    public static int area(int length , int breadth){
        return length * breadth ;
    }

    public static float area(int radius){
        return 3.14f * (radius * radius);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a length : ");
        int length = sc.nextInt();

        System.out.println("Enter a breadth : ");
        int breadth = sc.nextInt();

        System.out.println("Enter a radius : ");
        int radius = sc.nextInt();

        System.out.println("Area of rectangle is : " + area(length, breadth));
        System.out.println("Area of circle is : " + area(radius));

    }
}

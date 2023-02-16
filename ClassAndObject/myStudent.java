package ClassAndObject;

import java.util.*;

class student {
    public int roll ; 
    public String name ;
    public String course ;
    public int mark1 , mark2 , mark3 ;

    public String name(){
        return name ;
    }

    public int roll(){
        return roll ;
    }

    public int total(){
        return mark1 + mark2 + mark3 ;
    }

    public int average(){
        return total() / 3 ;
    }
    
    public String grade(){
       
        
        if (average() >= 80 ) {
            return "A+ Grade";
        } else if (average() >= 70 || average() <= 79 ) {
            return "A Grade";
        }else if(average() >= 60 || average() <= 69){
            return "B+ Grade";
        }
        else if(average() >= 50 || average() <= 59){
            return "B Grade";
        }
        return "F Grade";
    }
}
public class myStudent {
    public static void main(String[] args) {

        student s = new student();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name : ");
        s.name = sc.nextLine();
        System.out.print("Enter a roll : ");
        s.roll = sc.nextInt();
        System.out.println("Enter a Mark 1 : ");
        s.mark1 = sc.nextInt();
        System.out.print("Enter a Mark 2 : ");
        s.mark2 = sc.nextInt();
        System.out.print("Enter a Mark 3 : ");
        s.mark3 = sc.nextInt();

        System.out.println("Name : " + s.name());
        System.out.println("Roll : " + s.roll());
        System.out.println("Mark 1 is : " + s.mark1);
        System.out.println("Mark 2 is : " + s.mark2);
        System.out.println("Mark 3 is : " + s.mark3);
        System.out.println("Total marks is : " + s.total());
        System.out.println("Average marks is : " + s.average());
        System.out.println("Grade of student is : " + s.grade());

        sc.close();

    }
}

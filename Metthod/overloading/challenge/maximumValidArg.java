package Metthod.overloading.challenge;


public class maximumValidArg {

    static int maximum(int ...A){
        int maximum = Integer.MIN_VALUE ;
        for (int i = 0; i < A.length; i++) {
            if (maximum < A[i]) {
                maximum = A[i];
            }
        }
        return maximum ;
    }

    static int sum(int ...A){
        int sum = 0 ;
        for (int i = 0; i < A.length; i++) {
            sum = sum + i ;
        }
        return sum ;
    }

    public static void main(String[] args) {
        
        System.out.println("Maximum number : " + maximum( 40 , 20 , 90));
        System.out.println("Sum of element : " + sum( 1 , 2 ,3 , 4 , 6 , 7 ));
        System.out.println("Sum of element : " + sum( new int[] { 2 , 5 , 7 , 8, 3 }));

    }
    
}
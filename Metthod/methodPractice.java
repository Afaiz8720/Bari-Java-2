package Metthod;

public class methodPractice {

    int maximum(int x , int y){
        if(x > y){
            return x ;
        }
        return y ;
    }
    public static void main(String[] args) {
        
        methodPractice m = new methodPractice();

        int ans = m.maximum(10 , 5);
        System.out.println("Maximum number is : " + ans);
    }
}

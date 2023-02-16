package Metthod.overloading;

public class practice {

    static int max(int x , int y){
        if(x > y)
        {
            return x ;
        }
        else{
            return y ;
        }

    }

    static float max(float x , float y){
        if(x > y)
        {
            return x ;
        }
        else{
            return y ;
        }

    }

    static Double max(double x , Double y){
        if(x > y)
        {
            return x ;
        }
        else{
            return y ;
        }

    }
    public static void main(String[] args) {
        System.out.println("Int maximum method value is : " + max(20, 10));
        System.out.println("float maximum method value is : " + max(2.0, 10.0));
        System.out.println("double maximum method value is : " + max(25.70, 11.550));
    }
}

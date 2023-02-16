package Metthod.overloading;

public class variableArguement {

    static void show(int ...A){
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
    public static void main(String[] args) {
        show();
        show(10 , 30 , 50);
        System.out.println();
        show(new int[]{ 2 , 65 , 7 });
    }
}

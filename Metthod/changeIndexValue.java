package Metthod;

public class changeIndexValue {

    static void change(int arr[] , int index , int value){
        arr[index] = value ;
    }

    static void change2(int x , int value){
        x = value ;
    }
    public static void main(String[] args) {
        int arr[] = { 2 , 5 , 1 , 7 , 4};

        change(arr , 3 , 30);

        System.out.println("Change index value in array");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int x = 20 ;
        change2(x, 40);
        System.out.println("\nValue of primitive data type : " + x);
    }
}

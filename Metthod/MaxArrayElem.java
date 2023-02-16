package Metthod;

public class MaxArrayElem {

    static int maximumArrayElement(int arr[]){
        int maximum = Integer.MIN_VALUE ;

        for (int i = 0; i < arr.length; i++) {
            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        return maximum ;
    }
    public static void main(String[] args) {
        int arr[] = { 3 , 2 , 7 , 9 , 15 };
        
        System.out.println("Maximum element in array : " + maximumArrayElement(arr));
    }
}

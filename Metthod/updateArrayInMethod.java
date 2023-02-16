package Metthod;

public class updateArrayInMethod {

    void update(int arr[]){
        arr[0] = 10 ;
        System.out.println("\nArray in method after updating");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2 , 3 , 4 , 7 , 1};

        updateArrayInMethod u = new updateArrayInMethod();

        u.update(arr);

        System.out.println("\nArray in main method after updating in method");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        

    }
}

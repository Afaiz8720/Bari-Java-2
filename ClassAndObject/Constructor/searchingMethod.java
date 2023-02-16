package ClassAndObject.Constructor;

class searching {
    public boolean search(int arr[] , int item){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] == item){
                return true ;
            }
           
        }
        return false ;
    }
}
public class searchingMethod{
    public static void main(String[] args) {
        searching s = new searching();
        int arr[]  = {2 , 5 , 9 , 6 , 7};
        int item = 2 ;
        boolean ans = s.search(arr , item);
        if(ans){
            System.out.println("Item found");
        }
        else{
            System.out.println("Item not found");
        }
    } 
}
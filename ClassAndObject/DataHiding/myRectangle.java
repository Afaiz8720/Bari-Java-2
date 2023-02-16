package ClassAndObject.DataHiding;


class rectangle {
    private int length;
    private int breadth ;
    
    public int getLength(){
        return length ;
    }

    public int getBreadth(){
        return breadth ;
    }

    public void setLengthAndBreadth(int l , int b){
        length = l ;
        breadth = b ;
    }

    public int area(){
        return length * breadth ;
    }
}
public class myRectangle {
    public static void main(String[] args) {
        rectangle r = new rectangle();

        r.setLengthAndBreadth(10 , 30);
        
        System.out.println("Area is a : " + r.area());
    }
}

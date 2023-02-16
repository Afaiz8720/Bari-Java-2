package ClassAndObject.Constructor;

class rectangle{
    private int length ;
    private int breadth ;

    public rectangle(int l , int b){
        length = l ;
        breadth = b ;
    }

    public int area(){
        return length * breadth ;
    }
}

public class myRectangle {
    public static void main(String[] args) {
        rectangle r = new rectangle(30, 20);

        System.out.println("Area of rectangle is : " + r.area());
    }
}

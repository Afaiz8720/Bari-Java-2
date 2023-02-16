package ClassAndObject;

class rectangle {
    public double length ;
    public double breadth ;

    public double area(){
        return length * breadth ;
    }

    public double perimeter(){
        return 2 * (length + breadth) ;
    }

    public boolean isSquare(){
       if (length == breadth) {
            return true ;
       } else {
            return false ;
       }
    }

}

public class myRectangle {
    public static void main(String[] args) {
        rectangle r = new rectangle();

        r.breadth = 20 ;
        r.length = 10 ;

        double area = r.area();
        double preimeter = r.perimeter();
        System.out.println("Area of Rectangle is : " + area);
        System.out.println("Perimeter of Rectangle is : " + preimeter);
        System.out.println("That is Square : " + r.isSquare());
    }
}

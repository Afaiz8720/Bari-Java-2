package AbstractClass;

abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape {
    double radius ;
    public double perimeter(){
        return 2 * Math.PI * radius ;
    }

    public double area() {
        return Math.PI * radius * radius ;
    }
}

class Rectangle extends Shape {
    double length ;
    double breadth ;

    @Override
    public double perimeter() {
        return 2 * ( length + breadth) ;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
public class challenge {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.breadth = 10 ;
        r.length = 30 ;

        System.out.println("Area of rectangle = " + r.area());
        System.out.println("Perimeter of Rectangle = " + r.perimeter());

        // creating object with help of circle class 
        Circle c = new Circle();
        c.radius = 40 ;
        System.out.println("Area of circle = " + c.area());
        System.out.println("Perimeter of circle = " + c.perimeter());

        // creating object using shape class and using dynamic dispatch

        Shape s = r ;
       
        System.out.println("Area of rectangle shape = " + s.area());
        System.out.println("Perimeter of Rectangle shape = " + s.perimeter());
            
       


    }
}

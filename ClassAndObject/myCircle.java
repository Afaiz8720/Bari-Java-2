package ClassAndObject;

class Circle {
    public double radius ;

    public double area(){
        return  2 * Math.PI * radius * radius ;
    }
    
    public double perimeter(){
        return 2 * Math.PI * radius ;
    }

    public double circumference(){
        return perimeter() ;
    }
}

public class myCircle {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 10 ;
        double area = c.area();
        double perimeter = c.perimeter();
        double circumference = c.circumference();
        System.out.println("Area of circle : " + area);
        System.out.println("Perimeter of circle : " + perimeter);
        System.out.println("Circumference of circle : " + circumference);
    }
}

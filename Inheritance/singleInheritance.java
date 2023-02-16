package Inheritance;

class circle{
    public double radius ;

    public double area(){
        return Math.PI * radius * radius ;
    }

    public double perimeter(){
        return 2 * Math.PI * radius ;
    }

    public double circumference(){
        return perimeter() ;
    }
}

class cylinder extends circle {
    public double height ;

    public double volume(){
        return area() * height ;
    }
}
public class singleInheritance {
    public static void main(String[] args) {
        cylinder c = new cylinder();

        c.radius = 10 ;
        c.height = 40 ;
        
        double area = c.area();
        double perimeter  = c.perimeter();
        double circumference = c.circumference();
        double volume = c.volume();

        System.out.println( "Area of circle is : " + area );
        System.out.println( "Perimter of circle is : " + perimeter );
        System.out.println( "Circumference of circle is : " + circumference );
        System.out.println( "Volume of cylinder is : " + volume );
    }
}

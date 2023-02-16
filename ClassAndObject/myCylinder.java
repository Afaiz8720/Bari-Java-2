package ClassAndObject;

class Cylinder {
    public double radius ;
    public double height ;

    public double lidArea(){
        return Math.PI * radius * radius ;
    }

    public double totalSurfaceArea(){
        return (2 * Math.PI * height) + ( 2 * lidArea());
    }

    public double volume(){
        return lidArea() * height ;
    }
    
}
public class myCylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.height = 20 ;
        c.radius = 15 ;

        double lidArea = c.lidArea();
        double totalSurfaceArea = c.totalSurfaceArea();
        double volume = c.volume();

        System.out.println("Area of lid is : " + lidArea);
        System.out.println("Total surface area is : " + totalSurfaceArea);
        System.out.println("Volume of cylinder is : " + volume);
    }

}

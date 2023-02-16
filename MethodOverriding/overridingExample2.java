package MethodOverriding;
class car {
    public void start(){System.out.println("Car is start button");}
    public void accelartor(){System.out.println("Car have accelarator");}
    public void changeGear(){System.out.println("This car have manual gear");}
}

class superCar extends car {
    @Override
    public void start(){System.out.println("Car is start button");}
    @Override
    public void accelartor(){System.out.println("Car have accelarator");}
    @Override
    public void changeGear(){System.out.println("This car have automatic gear");}
    
    public void sunRoof(){System.out.println("Super car have sun roof");}
}
public class overridingExample2 {
    public static void main(String[] args) {
        
        superCar car2 = new superCar();
        car2.start();
        car2.accelartor();
        car2.changeGear();

        car2.sunRoof();
    }
}

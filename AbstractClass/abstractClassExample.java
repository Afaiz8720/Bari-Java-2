package AbstractClass;
abstract class Super {
    public Super(){System.out.println("Super Constructor");}

    public void method1(){
        System.out.println("Method 1 of Super");
    }

    abstract public void method2();
}

class sub extends Super{
    @Override
    public void method2(){
        System.out.println("Method 2 of Sub Class");
    }
} 
public class abstractClassExample {
    public static void main(String[] args) {
        Super s = new sub();
        s.method1();
        s.method2();
    }
}

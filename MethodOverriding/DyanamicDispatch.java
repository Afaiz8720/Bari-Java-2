package MethodOverriding;

class parent {
    public void method1(){System.out.println("parent Method 1");}
    public void method2(){System.out.println("parent Method 2");}
}

class child extends parent{
    @Override
    public void method2(){System.out.println("child Method 2");}
    public void method3(){System.out.println("child Method 3");}
}
public class DyanamicDispatch {
    public static void main(String[] args) {
        child s = new child();
        
        s.method2();
    }

}

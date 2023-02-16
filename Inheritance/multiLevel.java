package Inheritance;

class parent {
    public parent(){
        System.out.println("Parent Constructor");
    }
}
class midChild extends parent {
    public midChild(){
        System.out.println("Mid Child Constructor");
    }
}

class child extends midChild {
    public child(){
        System.out.println("Child constructor");
    }
}

public class multiLevel {
    public static void main(String[] args) {
        child c = new child();
    }
}

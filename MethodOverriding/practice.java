package MethodOverriding;

class parent {
    public void display(){
        System.out.println("Parent Class Display");
    }
}

class child extends parent {
 
    public void display(int z){
        System.out.println("child Class Display");
    }
}
public class practice {
    public static void main(String[] args) {
        parent c = new parent();
        c.display();

        child c1 = new child();
        c1.display();
    }
}

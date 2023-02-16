package ClassAndObject.Constructor;


class parent{
    public parent(){
        System.out.println("Non Parametrize constructor in parent");
    }

    public parent(int z){
        System.out.println("Parametrize constructor in parent");
    }
}

class child{
    public child(){
        System.out.println("Non Parametrize constructor in child");
    }

    public child(int z){
        System.out.println("Parametrize constructor in child");
    }
}

public class paraAndNonParaCon {
    public static void main(String[] args) {
        child c = new child(10);
        c = new child();
        System.out.println();
        parent p = new parent();
        p = new parent(30);


    }
}

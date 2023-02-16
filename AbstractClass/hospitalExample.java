package AbstractClass;

abstract class hospital {
    public hospital(){System.out.println("This is hospital Constructor");}

    abstract public void emergency();
    abstract public void appointment();
    abstract public void admit();
    abstract public void billing();

}

class myHospital extends hospital {

    @Override
    public void emergency(){
        System.out.println("Emergency Room Available");
    }

    @Override
    public void appointment() {
        System.out.println("Your appointment is done");
    }

    @Override
    public void admit() {
       System.out.println("Patient is admit");
    }

    @Override
    public void billing() {
        System.out.println("Please pay your bill here");  
    }
}
public class hospitalExample {
    public static void main(String[] args) {
        hospital h = new myHospital();
        h.emergency();
        h.admit();
        h.appointment();
        h.billing();
    }
}

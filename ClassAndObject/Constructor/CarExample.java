package ClassAndObject.Constructor;

class car {
    void getDetail(){
        System.out.println("A 4 wheeler car");
    }
}

class santro extends car {
    void getDetail(){
        //second method to use overridden program
        super.getDetail();
        System.out.println("Santro Xing 1000cc");
    }
}
public class CarExample {
    public static void main(String[] args) {
        santro s = new santro();
        s.getDetail();
    }
}

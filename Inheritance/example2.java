package Inheritance;

class parent {
    private int x ;

    //setting value of x
    public parent(int x){
        this.x = x ;
    }

    public int getX(){
        return x ;
    }

    void showData(){
        System.out.println("x = " + x);
    }
}

class child extends parent {
    private int y ;

    public child(int x){
        super(x);
    }

    public child(int x , int y){
        super(x);
        this.y = y ;
    }
    
    public int getY(){
        return y ;
    }

    @Override

    public void showData(){
        System.out.println("x = " + getX());
        System.out.println("y = " + y);
    }
}
public class example2 {
    public static void main(String[] args) {
        parent p = new parent(30);
        p.showData();
        child c = new child(10 , 20);
        c.showData();

    }
}

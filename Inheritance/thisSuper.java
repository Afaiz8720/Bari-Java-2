package Inheritance;

class Rectangle {
    private int length ;
    private int breadth ;
    int x = 10 ;
    public Rectangle(int length , int breadth){
       this.breadth = breadth ;
       this.length = length ;    
   }
  
}

class Cuboid extends Rectangle {
    int height ;
    int x = 20 ;

    public Cuboid(int l , int b , int h){
       super(l ,b);
       height = h ;
    }
   
    public void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
}
public class thisSuper {
    public static void main(String[] args) {
    Cuboid c = new Cuboid(20, 10, 70);
    c.display();
    }
}

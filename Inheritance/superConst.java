package Inheritance;

class Rectangle{
    int length ;
    int breadth ;

    Rectangle(){
        length = breadth = 1 ;
    }

    Rectangle(int l , int b ){
        length = l ;
        breadth = b ;
    }
}

class Cuboid extends Rectangle{
    int height ;

    Cuboid(){
        height = 1 ;
    }

    Cuboid(int h , int l , int b ){
       super(l,b);
       height = h;
    }

    int volume(){
        return length * breadth * height ;
    }

}

public class superConst {
    public static void main(String[] args) {
        Cuboid c = new Cuboid();

        System.out.println("Cuboid volume is : " + c.volume());

    }
}

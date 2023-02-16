package ClassAndObject.Constructor;

class cylinder{
    public int radius ;
    public int height ;

    public int getRadius(){
        return radius ;
    }

    public int getHeight(){
        return height ;
    }

    public void setRadius(int r){
       radius = r ;
    }

    public void setHeight(int h){
        height = h ;
    }

    public cylinder(){
        radius = 1 ;
        height = 1 ;
    }

    public cylinder(int r ){
        radius = r ;
    }

    public cylinder(int r , int h ){
        radius = r ;
        height = h ;
    }

    public int dimension(int height , int radius ){
        return (int) (4 * Math.PI * radius * height) ;
    }

}

public class myClinder {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 10 ;
        int r = c.radius ;

        c.height = 40 ;
        int h = c.height ;

        cylinder c2 = new cylinder(r);
        cylinder c3 = new cylinder(h , r);

        System.out.println("Dimension is : " + c.dimension(h, r));
       

        



    }
}

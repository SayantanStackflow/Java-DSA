class Dimentions{
    int x;
    int y;
    Dimentions(int x, int y){
        this.x= x;
        this.y= y;
    }
    void area(){
        System.out.println("Area is : "+(x*y));
    }
}
class Rectangle extends Dimentions{
    Rectangle(int x, int y){
        super(x, y);
    }
    void area(){
        System.out.println("Area of the rectangle: "+(x*y));
    }
}
class Triangle extends Dimentions{
    Triangle(int x, int y){
        super(x, y);
    }
    void area(){
        System.out.println("Area of the Triangle: "+.5*x*y);
    }
}
class DimentionMain{
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(12, 8);
        r1.area();
        Triangle t1= new Triangle(15, 5);
        t1.area();
    }
}
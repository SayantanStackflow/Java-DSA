interface Volume{
    final static double pi= 3.14;
    double CalVolume( double radius, double height);
}
class Cylinder implements Volume{
    public double CalVolume(double radius, double height){
        return pi*radius*radius*height;
    }
}
class Cone implements Volume{
    public double CalVolume(double radius, double height){
        return( pi* radius*radius*height/3);
    }
}
class InterfaceMain{
    public static void main(String[] args) {
        Cylinder cy= new Cylinder();
        double cyvol= cy.CalVolume(14, 5);
        System.out.println("The volume of the cylinder is: "+cyvol);
        Cone cn= new Cone();
        double cnvol= cn.CalVolume(15, 5);
        System.out.println("The volume of the cone is: "+cnvol);
    }
}
class Box{
    int l, b, h;
    Box(int l, int b, int h){
        this.l= l;
        this.b= b;
        this.h= h;
    }
    int volume(){
        return l*b*h;
    }
}
class BoxWeight extends Box{
    int p;
    BoxWeight(int l, int b, int h, int p){
        super(l, b, h);
        this.p= p;
    }
}
class Shipment extends BoxWeight{
    int cpv, cpw;
    Shipment( int l, int b, int h, int p, int cpv, int cpw){
        super(l, b, h, p);
        this.cpv= cpv;
        this.cpw= cpw;
    }
    int shipmentcostPerVolume(){
        return cpv*volume();
    }
    int shipmentcostPerWeight(){
        return cpw*p;
    }
}
public class Parcel{
    public static void main(String[] args) {
        Shipment obj= new Shipment(18, 12, 5, 1000, 7, 6);
        System.out.println("Shipment cost of the parcel wrt Volume: "+obj.shipmentcostPerVolume());
        System.out.println("Shipment cost of the parcel wrt weight: "+obj.shipmentcostPerWeight());
    }
}
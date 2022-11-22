interface sales{
    void salesFigure(int qnty);
}
class item{
    String title;
    double price;
    item(String t, double p){
        title= t;
        price= p;
    }
}
class HardwareItem extends item implements sales{
    int id;
    String manufacture;
    HardwareItem(int i, String m, String t, double p){
        super(t, p);
        id= i;
        manufacture= m;
    }
    public void salesFigure(int qnty){
        double amount= qnty* price;
        System.out.println("===Hardware Item===");
        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("Manufacture: "+manufacture);
        System.out.println("Price: "+price);
        System.out.println("Sales figure: "+amount);

    }
}
class SoftwareItem extends item implements sales{
    int id;
    String OS;
    SoftwareItem(int i, String o, String t, double p){
        super(t, p);
        id= i;
        OS= o;
    }
    public void salesFigure(int qnty){
        double amount= qnty* price;
        System.out.println("===Software Item===");
        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Sales figure: "+amount);

    }
}
class Company{
    public static void main(String[] args) {
        SoftwareItem st= new SoftwareItem(1, "Windows11pro", "VS Code", 45);
        HardwareItem ht= new HardwareItem(2, "Gigabyte", "Motherboard", 100);
        st.salesFigure(10);
        ht.salesFigure(5);
    }
}
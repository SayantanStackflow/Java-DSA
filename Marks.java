import java.util.Scanner;
public class Marks{
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("Marks of Subject1: ");
        double a1= value.nextFloat();
        System.out.println("Marks of Subject2: ");
        double a2= value.nextFloat();
        System.out.println("Marks of Subject3: ");
        double a3= value.nextFloat();
        System.out.println("Marks of Subject4: ");
        double a4= value.nextFloat();
        System.out.println("Marks of Subject5: ");
        double a5= value.nextFloat();
        double ans= (a1+ a2+ a3+ a4+ a5)/500* 100;
        System.out.println("The student's CBSC percentage is : "+ans +"%");
    }
}
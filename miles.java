import java.util.Scanner;
public class miles{
    public static void main(String[] args) {
        Scanner km= new Scanner(System.in);
        System.out.println("The value to be converted: " );
        double val= km.nextDouble();
        double mile= val* 0.621371;
        System.out.println(mile+" miles");
    }
}
import Calculator.*;
class CalculatorMain{
    public static void main(String[] args) {
        calculator cal= new calculator();
        System.out.println("The sum is: "+cal.addition(10.0, 20.0));
        System.out.println("The difference is: "+cal.substraction(15.0, 12.0));
        System.out.println("The product is: "+cal.multiplicatiion(12.0, 4.0));
        System.out.println("The quotient is: "+cal.division(26.0, 2.0));
    }
}
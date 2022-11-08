import java.util.Scanner;
public class TwoDecimalInput {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double number1;
        double number2;

        System.out.print("Enter a number: ");
        number1 = input.nextDouble();

        System.out.print("Enter another number: ");
        number2 = input.nextDouble();
         
        System.out.println("Decimal numbers you entered are: " + number1 + " and " + number2);
        input.close();

    }
}
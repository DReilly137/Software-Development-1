import java.util.Scanner;
public class InputDouble{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        double number = 4.75;

        System.out.print("Enter a decimal number: ");
        number = input.nextDouble();

        System.out.println("Number entered is: " + number);
    }
}
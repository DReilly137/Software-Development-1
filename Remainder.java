import java.util.Scanner;

public class Remainder{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter First Integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 % number2;
        System.out.println("Remainder when " + number1 + " is divided by " + number2 + " is: " + sum);

    }
}
import java.util.Scanner;
public class Inputs{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String name = "Darren";
        int integer = 7;
        Double decimal = 4.75;

        System.out.print("Enter your first name: ");
        name = input.nextLine();

        System.out.print("Enter a whole number: ");
        integer = input.nextInt();

        System.out.print("Enter a decimal number: ");
        decimal = input.nextDouble();

        System.out.println(name + ", you entered the numbers " + integer + " and " + decimal + ".");

    }
}
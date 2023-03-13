import java.util.Scanner;
public class Inputs{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String name;
        int whole;
        double dec;

        System.out.print("Enter your first name: ");
        name = input.next();

        System.out.print("Enter a whole number: ");
        whole = input.nextInt();

        System.out.print("Enter a decimal number: ");
        dec = input.nextDouble();

        System.out.println(name+", you entered the numbers "+whole+" and "+dec+".");

    }
}
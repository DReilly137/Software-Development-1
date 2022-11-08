import java.util.Scanner;
public class Calculations{

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double x;
        int y;

        System.out.print("Enter a decimal number for x: ");
        x = input.nextDouble();

        System.out.print("Enter a whole number for y: ");
        y = input.nextInt();
         
        sum = x + y;
        System.out.println(x + "+" + y + "=" +sum);

        sum = x * y;
        System.out.Println(x + " * " + y + "=" + sum);

    }
}
import java.util.Scanner;

public class Circle{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int number;
        double sum1;
        double sum2;


        System.out.print("Enter the radius value of a circle: ");
        number = input.nextInt();

        sum1 = number * 2;
        System.out.println("Diameter: " + sum1);

        sum2 = sum1 * 3.1415926535;
        sum2 = Math.round(sum2 * 10.0) / 10.0;
        System.out.println("Circumference: " + sum2);

    }
}
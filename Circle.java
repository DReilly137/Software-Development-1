import java.util.Scanner;

public class Circle{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        double number1;
        String unit;
        double sum;

        System.out.print("Enter the radius of the circle: ");
        number1 = input.nextInt();
        System.out.print("Enter the unit of measurement for the circle: ");
        unit = input.next();

        sum = number1 * number1 * 3.1415926535;
        sum = Math.round(sum * 100.0) / 100.0;
        System.out.println("Area of the circle is " + sum + " " + unit);

    }
}
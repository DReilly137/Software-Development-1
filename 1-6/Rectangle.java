import java.util.Scanner;

public class Rectangle{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int number1;
        int number2;
        String unit;
        int sum;

        System.out.print("Enter the length of the rectangle: ");
        number1 = input.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        number2 = input.nextInt();
        System.out.print("Enter the unit of measurement for the rectangle: ");
        unit = input.next();

        sum = number1 * number2;
        System.out.println("Area of rectangle is " + sum + " " + unit + " square");

    }
}
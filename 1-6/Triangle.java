import java.util.Scanner;

public class Triangle{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter the length of the base of the triangle: ");
        number1 = input.nextInt();

        System.out.print("Enter the height of the triangle: ");
        number2 = input.nextInt();

        sum = number1 * number2 / 2;
        System.out.println("            *");
        System.out.println("           ***");
        System.out.println("         *** ***");
        System.out.println("       ***     ***");
        System.out.println("     ***         ***");
        System.out.println("   ***             ***");
        System.out.println(" ***                 ***");
        System.out.println(" ************************");
        System.out.println("        Area: "+sum+"   ");
        System.out.println("****************************");



    }
}
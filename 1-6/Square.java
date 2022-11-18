import java.util.Scanner;

public class Square{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int number;
        int sum1;
        int sum2;

        System.out.print("Enter single digit value for length and width: ");
        number = input.nextInt();

        sum1 = number * number;
        System.out.println("Area of square is: " + sum1 );

        sum2 = number + number + number + number;
        System.out.println("Perimeter of square is: " + sum2);

        System.out.println("************************");
        System.out.println("*                      *");
        System.out.println("*                      *");
        System.out.println("*   Area:     "+sum1+ "*");
        System.out.println("*   Perimeter:"+sum2+ "*");
        System.out.println("*                      *");
        System.out.println("*                      *");
        System.out.println("************************");


    }
}
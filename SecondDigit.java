import java.util.Scanner;
public class SecondDigit{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number;

        System.out.print("Enter a four digit number: ");
        number = input.nextInt();

        System.out.println("Second digit is " +number+ " is " +
                        (number % 1000 / 100));

        input.close();
    }
}
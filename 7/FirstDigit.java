import java.util.Scanner;
public class FirstDigit{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number;

        System.out.print("Enter a four digit number: ");
        number = input.nextInt();

        System.out.println("First digit is " +number+ " is " +
                        (number / 1000));

        input.close();
    }
}
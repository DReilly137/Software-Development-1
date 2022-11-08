import java.util.Scanner;
public class TwoNumbersInput {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int number1;
        int number2;

        System.out.print("Enter a number: ");
        number1 = input.nextInt();

        System.out.print("Enter another number: ");
        number2 = input.nextInt();
         
        System.out.println("Numbers you entered are: " + number1 + " and " + number2);
        input.close();

    }
}
import java.util.Scanner;
public class OneNumberInput {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();
         
        System.out.println("Number you entered is: " + number);
        input.close();

    }
}
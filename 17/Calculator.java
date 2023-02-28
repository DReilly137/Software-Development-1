import java.util.Scanner;
public class Calculator{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number;
        int sum = 0;
        
        
        do{
            System.out.print("Enter number (0 to quit): ");
            number = input.nextInt();
            sum += number;
        }while(number != 0);
            System.out.println("Sum of numbers entered is: "+ sum);


    }
}
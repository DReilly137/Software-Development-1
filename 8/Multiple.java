import java.util.Scanner;
public class Multiple{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number1, number2;

        System.out.print("Enter first number: ");
        number1=input.nextInt();

        System.out.print("Enter second number: ");
        number2=input.nextInt();

        if(number1 % number2 == 0){
            System.out.println(+number1+" is a multiple of "+number2);
        }

    }
}
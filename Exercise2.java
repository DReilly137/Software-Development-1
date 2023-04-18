import java.util.Scanner;
public class Exercise2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int result = (first + second) * 4;
        System.out.println("("+(first)+" + "+(second)+") * 4 = "+result);

        input.close();


    }
}
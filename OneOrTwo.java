import java.util.Scanner;
public class OneOrTwo{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number;

        System.out.print("Enter a number between 1 or 2: ");
        number = input.nextInt();

        if((number == 1) || (number == 2)){
            System.out.println("Number is valid");
        }else{
            System.out.println("Number is invalid");
        }
    }
}
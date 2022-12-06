import java.util.Scanner;
public class NumberRange{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if((number > 10) & (number < 20)){
            System.out.println(number + " is within range.");
        }else{
            System.out.println(number + " is not within range.");
        }
    }
}
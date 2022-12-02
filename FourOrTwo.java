import java.util.Scanner;
public class FourOrTwo{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if((number == 4) || (number == 2)){
            System.out.println("Number is 4 or 2");
        }else{
            System.out.println("Number is not 4 or 2");
        }
    }
}
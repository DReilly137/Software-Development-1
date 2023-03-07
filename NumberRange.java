import java.util.Scanner;
public class NumberRange{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        if(n >= 10 && n <= 20){
            System.out.println("Number entered is between 10 and 20");
        }else{
            System.out.println("Number entered is not between 10 and 20");
        }

    }
}
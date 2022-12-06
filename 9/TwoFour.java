import java.util.Scanner;
public class TwoFour{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.print("Enter a number: ");
        n1 = input.nextInt();
        System.out.print("Enter a second number: ");
        n2 = input.nextInt();

        if((n1 == 4) & (n2 == 2)){
            System.out.println("numbers entered are 4 and 2");
        }else{
            if((n1 == 4) || (n2 == 2)){
                System.out.println("One of numbers entered is 4 or 2");
            }else{
                System.out.println("None of the numbers entered are 4 or 2");
            }
        }
    }
}
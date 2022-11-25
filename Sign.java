import java.util.Scanner;
public class Sign{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n1;

        System.out.print("Enter number: ");
        n1=input.nextInt();

        if(n1 > 0){
            System.out.println("Number is positive");
        }
        
        if(n1 < 0){
            System.out.println("Number is negative");
        }

        if(n1 == 0){
            System.out.println("Number is equal to 0");
        }


    }
}
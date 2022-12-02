import java.util.Scanner;
public class Sign{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        if(n > 0){
            System.out.println("Number entered is postive");
        }else{
            if(n < 0){
                System.out.println("Number entered is negative");
            }else{
                if(n == 0){
                    System.out.println("Number entered is 0");
                }
            }
        }


    }
}
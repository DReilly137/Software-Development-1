import java.util.Scanner;
public class BigNumber{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        System.out.println();
        
        if(n > 1000000){
            System.out.println("The number entered IS GREATER than 1,000,000");
        }else{
            System.out.println("The number entered IS NOT GREATER than 1,000,000");
        }
        System.out.println();
        input.close();
    }
}

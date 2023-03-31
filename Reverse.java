import java.util.Scanner;
public class Reverse{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        do{
            System.out.print("Enter an integer (-1 to exit): ");
            n = input.nextInt();
        }while(n != -1);

    }
}
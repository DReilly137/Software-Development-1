import java.util.Scanner;
public class ZeroFifty{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=0;

        do{
            System.out.print("Enter a number:");
            i = input.nextInt();

        }while(i <= 50 && i >=0);
        System.out.println("Number entered which is not between 0 and 50. Program ends.");
        input.close();


    }
}
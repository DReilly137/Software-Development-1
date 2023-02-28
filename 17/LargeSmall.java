import java.util.Scanner;
public class LargeSmall{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;  
        int cont;
 
        do
        {
            System.out.print("Enter the number ");
            number = input.nextInt();
 
            if(number > max)
            {
                max = number;
            }
 
            if(number < min)
            {
                min = number;
            }
 
            System.out.print("Enter another number (1 for yes, 2 for no)? ");
            cont = input.nextInt();
 
        }while(cont != 2);
 
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);

    }
}
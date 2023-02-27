import java.util.Scanner;
public class Calculator{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=0;
        int loop=0;
        int sum=0;

        System.out.print("Enter a number (-1 to quit): ");
        loop = input.nextInt();

        while(loop != -1){
            System.out.print("Enter a number (-1 to quit): ");
            loop = input.nextInt();
            i++;
        }

        if(i !=-1){
            sum += i + i;
            System.out.println("Sum of numbers entered is: "+sum);
        }

    }
}
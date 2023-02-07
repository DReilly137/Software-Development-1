import java.util.Scanner;
public class Addition{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=1, n;
        int sum=0;


        while(i <= 5){
            System.out.print("Enter another number " +i+": ");
            n = input.nextInt();
            sum += n;
            i++;


        }
         System.out.print("When the five numbers are added together the result is: "+sum);

    }
}
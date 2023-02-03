import java.util.Scanner;
public class EigthLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 1, n, sum;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        while(i < 5){
            sum = n * i;
            System.out.println(+n" times "+i" = "+sum);
            ++i;
        }

    }
}
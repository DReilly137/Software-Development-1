import java.util.Scanner;
public class EightLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 1;
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        while(i <= 5){
            System.out.println(n+" times "+i+" = "+ (n*i));
            ++i;
        }

    }
}
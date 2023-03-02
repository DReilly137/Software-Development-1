import java.util.Scanner;
public class Guess2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number, guess=5, i=0;

        do{
            System.out.print("Guess the number: ");
            number = input.nextInt();
            i++;
        }while(number != guess);
            System.out.println("Good guess. It is "+guess+". It took you "+i+" attempt(s) to guess the number.");

    }
}
import java.util.Scanner;
public class Guess1{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number, guess=5, i=0;


        do{
            System.out.print("Guess the number: ");
            number = input.nextInt();
            i++;
        }while(number != guess);
            System.out.println("Good guess. It is "+guess+". It took you "+i+" attempts to guess the number.");


        

    }
}
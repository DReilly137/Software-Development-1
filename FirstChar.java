import java.util.Scanner;
public class FirstChar{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String word;

        System.out.print("Please enter a word: ");
        word = input.next();

        System.out.println(" The first character is " + word.charAt(0));
        input.close();
    }
}
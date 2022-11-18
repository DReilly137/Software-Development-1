import java.util.Scanner;
public class SecondChar{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String word;

        System.out.print("Please enter a word: ");
        word = input.next();

        System.out.println(" The second character is " + word.charAt(1));
        input.close();
    }
}
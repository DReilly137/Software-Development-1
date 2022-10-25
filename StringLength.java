import java.util.Scanner;
public class StringLength{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String word;

        System.out.print("Please enter a word: ");
        word = input.next();

        System.out.println(word + " Contains " + word.length() + " characters.");
        input.close();

    }
}
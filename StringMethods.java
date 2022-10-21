import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String word;

        System.out.println("==============");
        System.out.println("Requirement 1:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter a word: Number");
        word = input.next(Number);

        System.out.println("Number of characters in "+word+" is: "+word.length());

		/*
		 - Add code for rest of 
		   requirements here
		*/
		
        input.close();
    }
}

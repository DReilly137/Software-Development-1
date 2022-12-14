import java.util.Scanner;
public class Question2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String answer;

        System.out.println("Write a line of java code to assign an instance of the Scanner object for user input to a variable named sc");
        System.out.println();// skip a line
        System.out.print("Enter answer:");
        answer = input.nextLine();

        if(answer.equals ("Scanner sc = new Scanner(System.in)")){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
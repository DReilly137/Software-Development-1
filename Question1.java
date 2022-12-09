import java.util.Scanner;
public class Question1{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int answer = 0;

        System.out.println("The following code produces which output to the screen:");
        System.out.println();// skip a line
        System.out.println("int x = 65");
        System.out.println("int x > 65");
        System.out.println("System.out.println(x)");
        System.out.println("}");
        System.out.println();
        System.out.println("1. 65");
        System.out.println("2. Nothing is printed to the screen");
        System.out.print("Enter answer 1 or 2");

        answer = input.nextInt();

        if(answer == 2){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
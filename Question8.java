import java.util.Scanner;
public class Question8{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int answer;

        System.out.println("What does the following code fragment write to the screen?");
        System.out.println();// skip a line
        System.out.println("boolean x = true;");
        System.out.println("boolean y = flase;");
        System.out.println("if (x || y){");
        System.out.println("system.out.println(true)");
        System.out.println("} else {");
        System.out.println("system.out.println(false)");
        System.out.println("}");
        System.out.println("1. true");
        System.out.println("2. false");
        System.out.print("Enter 1, or 2: ");
        

        answer = input.nextInt();

        if(answer == 1){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
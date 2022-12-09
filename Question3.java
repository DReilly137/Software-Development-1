import java.util.Scanner;
public class Question3{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int answer;

        System.out.println("What will be the output of the following code?");
        System.out.println();// skip a line
        System.out.println("int x = 1");
        System.out.println("int y = 2");
        System.out.println();
        System.out.println("if (x == 1 && y == 2) {");
        System.out.println("System.out.println(true);");
        System.out.println("} else {");
        System.out.println("System.out.println(false);");
        System.out.println("}");
        System.out.println();
        System.out.println("1. false");
        System.out.println("2. true");
        System.out.println("3. no output");
        System.out.print("Enter answer 1, 2 or 3: ");

        answer = input.nextInt();

        if(answer == 2){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
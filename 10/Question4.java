import java.util.Scanner;
public class Question4{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int answer;

        System.out.println("What will be the output of the following code?");
        System.out.println();// skip a line
        System.out.println("int x = 1");
        System.out.println();
        System.out.println("if (x != 1) {");
        System.out.println("System.out.println(\"not equal to 1\");");
        System.out.println("} else {");
        System.out.println("System.out.print(\"equal to 1\");");
        System.out.println("}");
        System.out.println();
        System.out.println("1. not equal to 1");
        System.out.println("2. equal to 1");
        System.out.println("3. no output");
        System.out.println("4. error");
        System.out.println();
        System.out.print("Enter 1, 2, 3 or 4: ");
        

        answer = input.nextInt();

        if(answer == 2){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
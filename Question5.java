import java.util.Scanner;
public class Question5{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int answer;

        System.out.println("How many choices are possible when using a single if-else statement?");
        System.out.println();// skip a line
        System.out.println("Select one:");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.print("Enter 1, 2, 3 or 4: ");
        

        answer = input.nextInt();

        if(answer == 2){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
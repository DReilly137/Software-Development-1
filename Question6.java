import java.util.Scanner;
public class Question6{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int answer;

        System.out.println("Say that value has a value of 19 assigned to it, and that extra has a value of 25 assigned to it. Evaluate (to true or false) each of the following expressions:");
        System.out.println();// skip a line
        System.out.println("value >= extra");
        System.out.println("extra < value");
        System.out.println("value > -25");
        System.out.println("value <= extra");
        System.out.println();
        System.out.println("Select one:");
        System.out.println("1. true false true false");
        System.out.println("2. true true true false");
        System.out.println("3. false false true false");
        System.out.println("4. false false true true");
        System.out.print("Enter 1, 2, 3 or 4: ");
        

        answer = input.nextInt();

        if(answer == 4){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
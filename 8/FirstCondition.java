import java.util.Scanner;
public class FirstCondition{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number=input.nextInt();

        if(number == 7){
            System.out.println("Number entered is equal to 7");
        }
    }
}
import java.util.Scanner;
public class FifthLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 1;
        int counter = 1;

        System.out.print("Enter a counter value: ");
        counter = input.nextInt();

        while(i <= counter){
            System.out.println("Loop counter: "+i);
            ++i;
        }

    }
}
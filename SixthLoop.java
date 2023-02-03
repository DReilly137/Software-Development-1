import java.util.Scanner;
public class SixthLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 0;

        System.out.print("Enter loop counter value: ");
        i = input.nextInt();

        while(i < 5){
            System.out.println("Before loop");
            System.out.println("Inside loop- counter = "+i);
            System.out.println("After while loop");
            ++i;
        }

    }
}
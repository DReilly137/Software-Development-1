import java.util.Scanner;
public class Decrement{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number = 10;

        System.out.println("Number before post increment: "+number);
        System.out.println("Post increment number: "+(number--));
        System.out.println("Number after post increment: "+number);

        number = 10;

        System.out.println("Number before pre increment: "+number);
        System.out.println("Pre increment number: "+(--number));
        System.out.println("Number after pre increment: "+number);

    }
}
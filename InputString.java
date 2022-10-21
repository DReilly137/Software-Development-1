import java.util.Scanner;
public class InputString{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String name = "Darren";

        System.out.print("Enter your first name: ");
        name = input.nextLine();

        System.out.println("Hello " +name);
    }
}
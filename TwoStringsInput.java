import java.util.Scanner;
public class TwoStringsInput {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String name1;
        String name2;

        System.out.print("Enter first name: ");
        name1 = input.nextLine();

        System.out.print("Enter surname: ");
        name2 = input.nextLine();
         
        System.out.println("Name entered is: " + name1 + " " + name2);
        input.close();
    }
}

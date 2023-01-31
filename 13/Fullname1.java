import java.util.Scanner;
public class Fullname1{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String firstname, lastname;

        System.out.print("Enter first name: ");
        firstname = input.next();

        System.out.print("Enter last name: ");
        lastname = input.next();
        String fullname;
        
        fullname = firstname.concat(" ").concat(lastname);

        System.out.println(fullname);
        System.out.println();

    }
}
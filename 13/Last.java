import java.util.Scanner;
public class Last{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String str;

        System.out.print("Enter a string: ");
        str = input.next();

        
        System.out.print(str.charAt(str.length()-1));


    }
}
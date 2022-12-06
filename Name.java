import java.util.Scanner;
public class Name{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String n1;
        String n2 = "Darren";

        System.out.print("Enter a name: ");
        n1 = input.next();

        if(n1 == n2){
            System.out.println("Names match");
        }else{
            System.out.println("Names do not match");
        }


    }
}
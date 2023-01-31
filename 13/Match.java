import java.util.Scanner;
public class Match{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String v1, v2;

        System.out.print("Enter a value: ");
        v1 = input.next();

        System.out.print("Enter a second value: ");
        v2 = input.next();

        if(v1.equals(v2)){
            System.out.println("Values entered match");
        }else{
            System.out.println("Values entered do not match");
        }

    }
}
import java.util.Scanner;
public class AddWhat1{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        if(n>20){
            n+=2;
            System.out.println("Number updated to: "+n);
        }
        if(n>10 && n<=20){
            n+=3;
            System.out.println("Number updated to: "+n);
        }
        if(n<=10){
            n+=1;
            System.out.println("Number updated to: "+n);
        }

    }
}
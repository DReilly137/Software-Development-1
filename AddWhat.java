import java.util.Scanner;
public class AddWhat{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        if(n >= 10 && n <= 20){
            n+=100;
            System.out.println("Number updated to: "+n);
        }else if(n >= 40 && n <= 50){
            n+=400;
            System.out.println("Number updated to: "+n);
        }else{
            n+=10;
            System.out.println("Number updated to: "+n);
        }
        input.close();

    }
}
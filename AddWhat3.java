import java.util.Scanner;
public class AddWhat3{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        if(n>100){
            n+=10;
            System.out.println("Number updated to: "+n);
        }
        if(n>50 && n<=100){
            n+=5;
            System.out.println("Number updated to: "+n);
        }
        if(n>20 && n<=50){
            n+=2;
            System.out.println("Number updated to: "+n);
        }
        if(n<=20){
            n+=1;
            System.out.println("Number updated to: "+n);
        }

    }
}
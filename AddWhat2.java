import java.util.Scanner;
public class AddWhat2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        if(n>100){
            n*=10;
            System.out.println("Number updated to: "+n);
        }
        if(n>75 && n<=100){
            n*=8;
            System.out.println("Number updated to: "+n);
        }
        if(n>50 && n<=75){
            n*=6;
            System.out.println("Number updated to: "+n);
        }
        if(n>25 && n<=75){
            n*=4;
            System.out.println("Number updated to: "+n);
        }
        if(n<=25){
            n/=2;
            System.out.println("Number updated to: "+n);
        }

    }
}
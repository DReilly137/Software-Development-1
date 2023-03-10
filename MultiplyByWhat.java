import java.util.Scanner;
public class MultiplyByWhat{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        if(n >= 20 && n <= 30){
            n*=3;
            System.out.println("Number updated to: "+n);
        }else if(n >= 40 && n <= 50){
            n*=5;
            System.out.println("Number updated to: "+n);
        }else if(n >= 60 && n <= 70){
            n*=7;
            System.out.println("Number updated to: "+n);
        }else if(n >= 80 && n <= 90){
            n*=9;
            System.out.println("Number updated to: "+n);
        }else{
            n*=10;
            System.out.println("Number updated to: "+n);
        }
        input.close();


    }
}
import java.util.Scanner;
public class SumAgain{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n1;
        int n2;
        int sum;
        int cont;
        int i=0;

        System.out.print("Enter first number: ");
        n1=input.nextInt();
        System.out.print("Enter second number: ");
        n2=input.nextInt();
        sum = n1 + n2;
        System.out.println("sum of numbers: "+sum);
        System.out.print("Do you want to continue (1 for yes, 2 for no)? ");
        cont=input.nextInt();

        while(cont != 2){
            System.out.print("Enter first number: ");
            n1=input.nextInt();
            System.out.print("Enter second number: ");
            n2=input.nextInt();
            sum = n1 + n2;
            System.out.println("sum of numbers: "+sum);
            System.out.print("Do you want to continue (1 for yes, 2 for no)? ");
            cont=input.nextInt();
            i++;
        }
        if(i !=1){
            System.out.println("You looped: "+i+" time(s).");
        }
        input.close();

        

    }
}
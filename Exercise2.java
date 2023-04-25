import java.util.Scanner;
public class Exercise2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter first number: ");
        int n1=input.nextInt();
        System.out.print("Enter second number: ");
        int n2=input.nextInt();
        System.out.print("Enter third number: ");
        int n3=input.nextInt();
        System.out.print("Enter fourth number: ");
        int n4=input.nextInt();

        int sum = (n1+n2+n3+n4) * 2;
        System.out.println("("+n1+"+"+n2+"+"+n3+"+"+n4+") * 2 = "+sum);

        input.close();

    }
}

//Darren Reilly - 25/04/2023//
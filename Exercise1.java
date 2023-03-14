import java.util.Scanner;
public class Exercise1{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n1, n2, n3, n4, n5;

        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        System.out.print("Enter third number: ");
        n3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        n4 = input.nextInt();
        System.out.print("Enter fifth number: ");
        n5 = input.nextInt();

        int result = n1*n2*n3*n4*n5;

        System.out.println(n1+" * "+n2+" * "+n3+" * "+n4+" * "+n5+" = "+result);
        input.close();

    }
}
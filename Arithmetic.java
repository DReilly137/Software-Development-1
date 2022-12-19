import java.util.Scanner;
public class Arithmetic{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n1, n2, n3, n4, sum1, sum2;

        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        System.out.print("Enter third number: ");
        n3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        n4 = input.nextInt();
        System.out.println();

        sum1 = n1+n2+n3+n4;
        System.out.println(n1+" + "+n2+" + "+n3+" + "+n4+" = "+sum1);

        sum2 = n4-n1;
        System.out.println(n4+" - "+n1+" = "+sum2);

        input.close();

    }
}
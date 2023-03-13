import java.util.Scanner;
public class Exercise1{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n1, n2, n3;

        System.out.print("Enter number 1: ");
        n1 = input.nextInt();
        System.out.print("Enter number 2: ");
        n2 = input.nextInt();
        System.out.print("Enter number 3: ");
        n3 = input.nextInt();

        int result = n1*2 + n2*4 + n3*8;
        System.out.println(result);

    }
}
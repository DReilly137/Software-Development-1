import java.util.Scanner;
public class Formula{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int a, b, c, d, e, sum;

        System.out.print("Enter value for a: ");
        a = input.nextInt();

        System.out.print("Enter value for b: ");
        b = input.nextInt();

        System.out.print("Enter value for c: ");
        c = input.nextInt();

        System.out.print("Enter value for d: ");
        d = input.nextInt();

        System.out.print("Enter value for e: ");
        e = input.nextInt();

        sum = a - b * c + d / e;
        System.out.println(a + "-" + b +"*"+ c +"+"+ d +"/"+ e +"="+ sum);

    }
}
import java.util.Scanner;
public class Arithmetic{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int a, b, c, d, e;

        System.out.print("Enter a number for a: ");
        a = input.nextInt();
        System.out.print("Enter a number for b: ");
        b = input.nextInt();
        System.out.print("Enter a number for c: ");
        c = input.nextInt();
        System.out.print("Enter a number for d: ");
        d = input.nextInt();
        System.out.print("Enter a number for e: ");
        e = input.nextInt();

        a += 9;
        b -= 4;
        c *= 3;
        d /= 2;
        e %= 5;

        System.out.println("Value of a after adding 9 is: "+a);
        System.out.println("Value of b after subtracting 4 is: "+b);
        System.out.println("Value of c after multiplying by 3 is:" +c);
        System.out.println("Value of d after dividing by 2 is:" +d);
        System.out.println("Remainder value assigned to e after dividing e by 5: "+e);


    }
}
import java.util.Scanner;
public class ArithmeticDemo{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int result = 1;

        result += 2;
        System.out.println(result);

        result -=1;
        System.out.println(result);

        result *= 2;
        System.out.println(result);
        
        result /= 2;
        System.out.println(result);

        result += 8;
        System.out.println(result);

        result %= 7;
        System.out.println(result);

    }
}
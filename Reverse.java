import java.util.Scanner;
public class Reverse{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        do{
            System.out.print("Enter an integer (-1 to exit): ");
            n = input.nextInt();
            if(n != -1){
                System.out.println(ReverseNum(n));
            }
        }while(n != -1);

    }

    static int ReverseNum(int a){
        int reversed = 0;
        while (a != 0){
            int num = a % 10;
            reversed = reversed * 10 + num;
            a /= 10;
        }
        return reversed;
    }
}
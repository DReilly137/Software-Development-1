import java.util.Scanner;
public class TwelfthLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 1;
        int p = 1;

        while(i < 10){
            p*=i;
            ++i;
            
        }
        System.out.println("Product of all numbers from 1 to 10 = "+p);
    }
}
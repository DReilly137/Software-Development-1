import java.util.Scanner;
public class Sum{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=0, sum=0;

        while(i<100){
            sum+=i;
            ++i;
        }
        System.out.println("Sum of numbers from 1 to 100: "+sum);

    }
}
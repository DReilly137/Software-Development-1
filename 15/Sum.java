import java.util.Scanner;
public class Sum{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=1, sum1=0, sum2=0, sum3=0;

        while(i<=100){
            sum1+=i;
        if(i%2==0){
            sum2+=i;
        }else{
            sum3+=i;
        }
        ++i;
        }
        System.out.println("Sum of numbers from 1 to 100: "+sum1);
        System.out.println("Sum of even numbers 1 to 100:"+sum2);
        System.out.println("Sum of even numbers 1 to 100:"+sum3);

    }
}
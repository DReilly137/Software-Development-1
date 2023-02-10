import java.util.Scanner;
public class Sum{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i1=0, i2=2, sum1=0, sum2=0;

        while(i1<100){
            sum1+=i1;
            ++i1;
        }
        System.out.println("Sum of numbers from 1 to 100: "+sum1);

        while(i2<=100){   
            sum2+=i2; 
            i2+=2; 
        }     
        System.out.println(sum2); 

    }
}
import java.util.Scanner;
public class EleventhLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 1, sum = 0;

        while(i <= 75){
            sum+=i;
            ++i;
            
        }
        System.out.println("Sum of all numbers from 1 to 75 = "+sum);
    }
}
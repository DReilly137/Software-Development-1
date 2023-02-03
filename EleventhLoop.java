import java.util.Scanner;
public class EleventhLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 1, sum = 0, end;

        System.out.print("Enter end part of the loop: ");
        end = input.nextInt();

        while(i <= end){
            sum+=1;
            ++i;
            System.out.println("Sum of all numbers from 1 to "+end+" = "+sum);
        }

    }
}
import java.util.Scanner;
public class LargeSmall{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 1;
        int num;
        int min = 0, max = 0;

        while(i <= 5){
            System.out.print("Enter number "+i+": ");
            num = input.nextInt();
            if(i == 1){
                min = num;
                max = num;
            }
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            ++i;
        }
        System.out.println("The largest number is "+max);
        System.out.println("The smallest number is "+min);
        input.close();
    }
}
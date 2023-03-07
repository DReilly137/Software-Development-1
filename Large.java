import java.util.Scanner;
public class Large{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n, integer=0;
        int max = 0;  
        int min = 0;  

        System.out.print("Enter number of integers: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Enter integer "+i+": ");
            integer = input.nextInt();
            if(i == 1){
                max = integer;
                min = integer;
            }
            if(integer > max)
            {
                max = integer;
            }
 
            if(integer < min)
            {
                min = integer;
            }
        }

            System.out.println("Largest Integer is Integer :"+max);

    }
}
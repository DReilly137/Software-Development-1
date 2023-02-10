import java.util.Scanner;
public class times{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=1, n, opt, sum1, sum2;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        System.out.print("Select option 1 or 2: ");
        System.out.println("");
        System.out.println("1. Output addition table (1 to 12) for number entered.");
        System.out.println("2. Output multiplication table (1 to 12) for number entered.");
        System.out.println("");
        opt = input.nextInt();
        if(opt != 1 && opt != 2){
            System.out.println("Invalid choice");
        }else{
        while(i<=12){
            if(opt==1){
                sum1 = n + i;
                System.out.println(n+" + "+i+" = "+sum1);
            }else{
                sum2 = n * i;
                System.out.println(n+" * "+i+" = "+sum2);
            }
            ++i;
        }
        }


    }
}
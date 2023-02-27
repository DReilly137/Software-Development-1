import java.util.Scanner;
public class IncrDecr{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int val;
        int opt;

        System.out.print("Enter a value: ");
        val = input.nextInt();
        do{
            System.out.println("Menu: ");
            System.out.println("1. For Increment ++.");
            System.out.println("2. For Decrement --.");
            System.out.println("-1. To quit.");
            System.out.print("Enter option (1, 2 or -1): ");
            opt = input.nextInt();
            if(opt == 1){
                val++;
            }
            if(opt == 2){
                val--;
            }
        }while(opt != -1);
            System.out.println("Value of number entered: "+val);

    }
}
import java.util.Scanner;
public class Zero{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        System.out.println();

        if(n == 0){
            System.out.println("The number entered is EQUAL to zero");
        }else{
            System.out.println("The number entered is NOT EQUAL to zero");
        }
        System.out.println();
        input.close();
    }
}

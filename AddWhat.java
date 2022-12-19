import java.util.Scanner;
public class AddWhat {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        if(n > 100){
            System.out.println(n+" + "+ 10 +" = "+ (n + 10));
        }else if(n > 50)

    }
}
import java.util.Scanner;
public class AddWhat {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        if(n > 100){
            System.out.println(n+" + "+ 10 +" = "+ (n + 10));
        }else if(n > 50){
            System.out.println(n+" + "+ 20 +" = "+ (n + 20));
        }else{
            System.out.println(n+" + "+ 30 +" = "+ (n + 30));
        }

    }
}

// Darren Reilly 13/12/2022
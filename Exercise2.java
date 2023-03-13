import java.util.Scanner;
public class Exercise2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter number apart from ten: ");
        n = input.nextInt();

        if(n != 10){
            System.out.println("Number entered is not equal to 10");
        }else{
            System.out.println("You are not allowed to enter the number 10");
        }
        input.close();

    }
}
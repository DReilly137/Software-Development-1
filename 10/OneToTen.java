import java.util.Scanner;
public class OneToTen{

    public  static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number from 1 to 10: ");
        number = input.nextInt();

        if((number >= 1) & (number <= 10)){
            System.out.println("Number is valid");
        }else{
            System.out.println("Number is invalid");
        }

    }
}
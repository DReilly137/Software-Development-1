import java.util.Scanner;
public class WhichNumberSwitch{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        switch(number){
            case 0:
                System.out.println(0);
                break;

            case 1:
                System.out.println(1);
                break;
            
            case 2:
                System.out.println(2);
                break;
            
            case 3:
                System.out.println(3);
                break;

            case 4:
                System.out.println(4);
                break;

            default:
                System.out.println("Not allowed");
        }

    }
}
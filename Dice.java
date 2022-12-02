import java.util.Scanner;
public class Dice{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number from 1 to 6");
        number = input.nextInt();

        switch(number){
            case 1:
                System.out.println("|           |");
                System.out.println("|     *     |");
                System.out.println("|           |");
            break;
            case 2:
                System.out.println("|        *  |");
                System.out.println("|           |");
                System.out.println("|  *        |");
            break;
            case 3:
                System.out.println("|        *  |");
                System.out.println("|     *     |");
                System.out.println("|  *        |");
            break;
            case 4:
                System.out.println("|  *     *  |");
                System.out.println("|           |");
                System.out.println("|  *     *  |");
            break;
            case 5:
                System.out.println("|  *     *  |");
                System.out.println("|     *     |");
                System.out.println("|  *     *  |");
            break;
            case 6:
                System.out.println("|  *     *  |");
                System.out.println("|  *     *  |");
                System.out.println("|  *     *  |");
            break;
            default:
                System.out.println("Invalid choice. Must enter number from 1 to 6.");
        }
    }
}
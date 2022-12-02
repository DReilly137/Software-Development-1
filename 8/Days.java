import java.util.Scanner;
public class Days{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n1;

        System.out.print("Enter number: ");
        n1=input.nextInt();

        if(n1 < 1){
            System.out.println("number is less than 1");
        }

        if(n1 > 7){
            System.out.println("number is greater than 7");
        }

        if(n1 == 1){
            System.out.println("Monday");
        }

        if(n1 == 2){
            System.out.println("Tuesday");
        }

        if(n1 == 3){
            System.out.println("Wednesday");
        }

        if(n1 == 4){
            System.out.println("Thursday");
        }

        if(n1 == 5){
            System.out.println("Friday");
        }

        if(n1 == 6){
            System.out.println("Saturday");
        }

        if(n1 == 7){
            System.out.println("Sunday");
        }


    }
}
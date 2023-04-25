import java.util.Scanner;
public class Exercise4{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        college();

        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.println(first+" - "+second+" = "+diff(first, second));

    }

    static void college(){
    System.out.println("This is ATU");
}
    static int diff(int a, int b){
        int sum = a - b;
        return sum;
    }


}



//Darren Reilly - 25/04/2023
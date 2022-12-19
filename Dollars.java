import java.util.Scanner;
public class Dollars{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        double dollar, euro;

        System.out.print("Enter current Euro to US Dollar conversion rate: ");
        dollar = input.nextDouble();
        System.out.print("Enter the amount of Euro to convert to US Dollar: ");
        euro = input.nextDouble();

        System.out.println(euro+" euro will get you: "+(Math.round(euro * dollar * 100.0)/100.0)+" US Dollars");
        input.close();
    }
}
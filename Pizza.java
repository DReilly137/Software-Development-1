import java.util.Scanner;
public class Pizza{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        double cost;
        String topping;
        int slices;
        int day;
        int month;
        int year;

        System.out.print("How much does pizza cost in your area? ");
        cost=input.nextDouble();

        System.out.print("What is your favourite one-word topping? ");
        topping=input.next();

        System.out.print("How many slices of "+topping+" pizza can you eat in one sitting?");
        slices=input.nextInt();

        System.out.print("Enter a value for day: ");
        day=input.nextInt();

        System.out.print("Enter a value for month: ");
        month=input.nextInt();

        System.out.print("Enter a value for year: ");
        year=input.nextInt();

        System.out.println("Why not treat yourself to dinner on "+day+"/"+month+"/"+year+".");
        System.out.println("Have "+slices+" slices of "+topping+" pizza!");
        System.out.println("It will only cost you "+cost+".");
        input.close();
    }

}
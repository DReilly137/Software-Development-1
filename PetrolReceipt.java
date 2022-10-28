import java.util.Scanner;

public class PetrolReceipt{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        String name = "Applegeen Garage";
        double litres;
        double price;
        double time;
        int date;
        double sum;

        System.out.print("Enter garage name: ");
        name = input.nextInt();
        System.out.print("Enter number of litres: ");
        litres = input.next();
        System.out.print("Enter price/litres: ");
        price = input.next();
        System.out.print("Enter time (hh:mi): ");
        time = input.next();
        System.out.print("Enter date (dd-mon-yyyy): ");
        date = input.next();

        sum = litres * price * 3.1415926535;
        sum = Math.round(sum * 100.0) / 100.0;
        System.out.println("+-------------------------------+");
        System.out.println("|                               |");
        System.out.println("|    "+name+"                   |");
        System.out.println("|                       	    |");
        System.out.println("|     "+date+"      "+time+"    |");
        System.out.println("|                       	    |");
        System.out.println("|     Litres:       "+litres+" 	|");
        System.out.println("|     Price/Litre:  "+price+" 	|");
        System.out.println("|                       	    |");
        System.out.println("|     Fuel total:    "+sum+"	|");
        System.out.println("|                       	    |");
        System.out.println("+-------------------------------+");

    }
}
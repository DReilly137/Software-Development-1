import java.util.Scanner;
public class Charity{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String name;
        int donation;

        System.out.print("Enter your name: ");
        name = input.next();

        System.out.print("Enter donation amount: ");
        donation = input.nextInt();

        if(donation < 20){
            System.out.println("Thanks "+name+" for your donation. We will use it to purchase a book for someone in need");
        }else if(donation >= 20 && donation < 40){
            System.out.println("Thanks "+name+" for your donation. We will use it to purchase a clothes voucher for someone in need");
        }else if(donation >= 40){
            System.out.println("Thanks "+name+" for your donation. We will use it to purchase a food hamper for someone in need");
        }

    }
}
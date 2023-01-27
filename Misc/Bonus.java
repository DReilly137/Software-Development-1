import java.util.Scanner;
public class Bonus{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        double wage;

        System.out.print("Enter weekly wage: ");
        wage = input.nextDouble();
        System.out.print("Enter grade: ");
        char grade = input.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("You get an extra 100 euro bonus!");
                System.out.println("Your new wage is "+(wage+100));
                break;
            case 'B':
                System.out.println("You get an extra 50 euro bonus!");
                System.out.println("Your new wage is "+(wage+50));
                break;
            case 'C':
                System.out.println("You get an extra 10 euro bonus!");
                System.out.println("Your new wage is "+(wage+10));
                break;
        }

    }
    
}
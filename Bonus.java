import java.util.Scanner;
public class Bonus{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        double wage;
        char grade;

        System.out.print("Enter weekly wage: ");
        wage = input.nextDouble();
        System.out.print("Enter grade: ");
        grade = input.nextChar();

        switch(grade){
            case 'A':
                System.out.println("You get an extra 100 euro bonus!");
                System.out.println("Your new wage is "+(wage+100));
                break;
        }

    }
    
}
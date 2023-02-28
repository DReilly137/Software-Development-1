import java.util.Scanner;
public class Grades2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=1;
        int grade=0;
        int sum=0;

        do{
            sum += grade;
            System.out.print("Enter grade "+i+" (0 to quit): ");
            grade=input.nextInt();
            ++i;
        }while(grade != 0);
            System.out.println("Average grade is "+((double) sum/i));

    }
}
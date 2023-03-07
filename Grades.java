import java.util.Scanner;
public class Grades{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int i=1, grade=0, sum=0;

        do{
            sum+=grade;
            System.out.print("Enter grade "+i+" (-1 to quit): ");
            grade = input.nextInt();
            ++i;
        }while(grade != -1);
            System.out.println("Average grade is: "+((double) sum/i));

        input.close();
    }
}
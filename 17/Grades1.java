import java.util.Scanner;
public class Grades1{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=0;
        int grade=0;
        int sum=0;

        while(i<10){
            sum += grade;
            System.out.print("Enter grade: ");
            grade = input.nextInt();
            ++i;
        }
        System.out.println("Average grade is "+((double) sum/i));
        input.close();

    }
}
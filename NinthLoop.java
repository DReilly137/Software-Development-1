import java.util.Scanner;
public class NinthLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int total = 0;
        int counter = 1;
        int grade = 0;
        double average = 0;

        while(counter <=5){
            System.out.print("Enter grade: ");
            grade = input.nextInt();
            total = total + grade;
            counter = counter + 1;
        }

        average = total / 5;

        System.out.println("\ntotal of all grades is "+ total);
        System.out.println("Class average is "+average);

        

    }
}
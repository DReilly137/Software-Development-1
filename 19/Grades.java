import java.util.Scanner;

public class Grades {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int grade = 0;
        int total = 0;
        int i = 2;
        
        System.out.print("Enter grade 1 (-1 to quit): ");
        grade = input.nextInt();

        while(grade != -1){
            total += grade;
            System.out.print("Enter grade "+i+" (-1 to quit): ");
            grade = input.nextInt();
            counter++;
            i++;           
        }

        if(counter != 0){
            System.out.println("Average grade is: "+((double) total/counter));
        }
        input.close();
    }
}
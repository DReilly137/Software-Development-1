import java.util.Scanner;
public class Grades{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int q1, q2, q3;
        double avg;

        System.out.print("Enter your score for quiz 1:");
        q1 = input.nextInt();
        System.out.print("Enter your score for quiz 2:");
        q2 = input.nextInt();
        System.out.print("Enter your score for quiz 3:");
        q3 = input.nextInt();

        avg = (q1 + q2 + q3) / (3);

        if(avg >= 90){
            System.out.println("Your grade is A");
        }else{
            if((avg >= 70) & (avg < 90)){
                System.out.println("Your grade is B");
            }else{
                if((avg >= 50) & (avg < 70)){
                    System.out.println("Your grade is C");
                }else{
                    if(avg < 50){
                        System.out.println("Your grade is F");
                    }
                }
            }
        }


    }
}
import java.util.Scanner;
public class Average{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println(avg(10,20,30));

    }

    static double avg(int a, int b, int c){
        int sum = a+b+c;
        double average = sum/3.0;
        return sum;
    }
}
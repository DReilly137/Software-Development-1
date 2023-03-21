import java.util.Scanner;
public class FifthArray{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[] x;
        x = new int[8];
        double avg=0;
        int sum=0;

        for(int i=0; i < x.length; ++i){
            System.out.print("Enter value for element "+ (i+1) + ": ");
            x[i] = input.nextInt();
        }

        System.out.println("Index\tValue\n");
        System.out.println("-----\t-----\n");

        for(int i=0; i < x.length; i++){
            System.out.println(i +"\t"+ x[i]);
            sum+=x[i];
            avg = sum/x[i];
        }
        System.out.println();
        System.out.println("Average of array values is: "+avg);
        

    }
}
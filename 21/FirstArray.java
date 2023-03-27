import java.util.Scanner;
public class FirstArray{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[] x;
        x = new int[4];

        for(int i=0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }
        System.out.println();

    }
}
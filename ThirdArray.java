import java.util.Scanner;
public class ThirdArray{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[] x = {1, 2, 3, 4, 5};
        System.out.println("Index\tValue\n");

        for(int i=0; i < x.length; i++){
            System.out.println(i +"\t"+ x[i]);
        }
        System.out.println();

    }
}
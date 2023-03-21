import java.util.Scanner;
public class SeventhArray{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};

        System.out.println("Index\tBefore\tAfter\n");
        System.out.println("-----\t-----\t-----\n");

        for(int i=0; i < x.length; i++){
            System.out.println(i +"\t"+ x[i]);
        }
        System.out.println();



    }
}
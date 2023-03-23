import java.util.Scanner;
public class TwoD_Array{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[][] x = {{1,2},{3,4}};

        System.out.println();
        System.out.println("Content of array accessed using a for loop: ");
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                System.out.println(x[i][j]);
            }
        }

    }
}
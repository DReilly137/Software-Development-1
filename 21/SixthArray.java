import java.util.Scanner;
public class SixthArray{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};

        System.out.print("Enter search number: ");
        int which = input.nextInt();

        int where=-1;
        for(int i=0; i<x.length; i++){
            if(x[i] == which){
                where = i;
                break;
            }

        }
        System.out.println();
        if(where == -1){
            System.out.println("Number is not contained in the array");
        }
        else{
            System.out.println("Number is contained in the array at index "+where);
        }
        input.close();



    }
}
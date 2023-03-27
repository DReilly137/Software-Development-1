import java.util.Arrays;
import java.util.Scanner;
public class CreateArray{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println("int or double array?");
        System.out.print("Enter 1 for int array, 2 for double array: ");
        int type = input.nextInt();

        System.out.print("How many values do you need to store in the array: ");
        int size = input.nextInt();

        if(type == 1){
            int array[] = new int [size];
            for(int i=0; i<size; i++) {
            System.out.print("Enter value "+(i+1)+": ");
            array[i] = input.nextInt();
            }
            input.close();
            System.out.println("Values in array are: ");
            System.out.println(Arrays.toString(array));
        }else if(type ==2){
            double array[] = new double [size];
            for(int i=0; i<size; i++){
                System.out.print("Enter value "+(i+1)+": ");
                array[i] = input.nextDouble();
            }
            input.close();
            System.out.println("Values in array are: ");
            System.out.println(Arrays.toString(array));
        }
    }
}
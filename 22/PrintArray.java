import java.util.Scanner;
public class PrintArray{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        outputArray(array);

    }

    static void outputArray(int[] array){
        System.out.println("Index\tValue\tSquare");
        System.out.println("=====\t=====\t=====");
        for(int i = 0; i < array.length; i++){
            int squared = array[i] * array[i];
            System.out.println(i+"\t"+array[i]+"\t"+squared);
            }
        }
        
    }
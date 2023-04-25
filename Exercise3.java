import java.util.Scanner;
public class Exercise3{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        double average = 0;

        System.out.println("There are "+numbers.length+" values in the numbers array.");
        System.out.println();
        System.out.println("The values are: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("The first, fourth, seventh and tenth values in the numbers array are: ");
        System.out.println(numbers[0]+" "+numbers[3]+" "+numbers[6]+" "+numbers[9]);
        
        for(int i=0; i < numbers.length; i++){
            sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9];
            average = sum/numbers.length;
        }

        System.out.println("The sum total of all values in the array is: "+sum);

        System.out.println("The average of all the values in the array is: "+average);



    }
}

//Darren Reilly - 25/04/2023
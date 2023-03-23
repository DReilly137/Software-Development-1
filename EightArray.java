import java.util.Scanner;
public class EightArray{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
        int n;

        System.out.print("Enter number to remove from array: ");
        n = input.nextInt();

        boolean found = false;
        for(int i=0; i < x.length; i++){
            if(x[i] == n){
                for(int j=i; j < x.length - 1; j++){
                    x[j] = x[j + 1];
                }
                x[x.length - 1] = 0;
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Index\tValue");
            System.out.println();
            for(int i=0; i < x.length; i++){
                System.out.println(i+"\t"+x[i]);
            }
            System.out.println();
        }else{
            System.out.println("Number not found");
        }


    }
}
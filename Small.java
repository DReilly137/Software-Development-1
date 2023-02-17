import java.util.Scanner;
public class Small{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int smallest=0, number, integer;

        System.out.print("Enter number of integers: ");
        number=input.nextInt();

        for(int i=0; i<number; i++){
            System.out.print("Enter integer: ");
            integer=input.nextInt();
            if(i == 0){
                smallest = integer;
            }
            if(smallest > integer){
               smallest=integer; 
            }
        }
        System.out.println(smallest);

    }
}
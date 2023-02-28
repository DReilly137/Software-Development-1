import java.util.Scanner;
public class ReadSetIntegers{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number;
        int cont;
        int evensum=0;
        int oddsum=0;

        do{
            System.out.print("Enter the number: ");
            number=input.nextInt();
            System.out.print("Do you want to continue (1 for yes, 2 for no)? ");
            cont=input.nextInt();
            if(number % 2 == 0){
                evensum+=number;
            }else{
                oddsum+=number;
            }
        }while(cont != 2);
            System.out.println("Sum of even numbers: "+evensum);
            System.out.println("Sum of odd numbers: "+oddsum);

    }
}
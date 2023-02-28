import java.util.Scanner;
public class CountNumbers{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number=0;
        int cont;
        int pos=0;
        int neg=0;
        int zero=0;

        do{
            System.out.print("Enter the number: ");
            number=input.nextInt();
            System.out.print("Do you want to continue (1 for yes, 2 for no)? ");
            cont=input.nextInt();
            if(number > 0){
                pos++;
            }if(number < 0){
                neg++;
            }if(number == 0){
                zero++;
            }
        }while(cont != 2);
            System.out.println("Positive numbers: "+pos);
            System.out.println("Negative numbers: "+neg);
            System.out.println("Zero numbers: "+zero);

    }
}
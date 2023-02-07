import java.util.Scanner;
public class Wages{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=0;
        int hrs;
        double wages, rate;

        while(i<3){
        System.out.print("Enter hours worked: ");
        hrs = input.nextInt();

        System.out.print("Enter hourly rate: ");
        rate = input.nextDouble();

        if(hrs<=40){
        wages = hrs*rate;
        }
        else{
        wages = rate*40 + (hrs-40)*rate*1.5;
        }
        System.out.println("pay of employee "+(i+1)+" is: "+wages);
        ++i;
        }

    }
}
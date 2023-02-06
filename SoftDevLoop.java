import java.util.Scanner;
public class SoftDevLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 0;
        int counter = 1;

        
        while(i < 30){
            if(i==4){
                System.out.println("Soft");
            }if(i==15){
                System.out.println("Dev");
            }if(i==21){
                System.out.println("One");
            }if(i==29){
                System.out.println("SoftDevOne");  
            }     
            System.out.println(+counter);
            ++i;
            ++counter;
            
        }

    }
}
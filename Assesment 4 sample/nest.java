import java.util.Scanner;
public class nest{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int counter = 1;

        for(int i=1; i<=5; i++){
            System.out.print("Line "+i+":");
            for(int j=1; j<=4; j++){
                if(j == 4){
                System.out.print(" "+counter+" ");
                ++counter; 
                }else{
                System.out.print(" "+counter+", ");
                ++counter;
                }
                
            }
            System.out.println();
        }

    }
}
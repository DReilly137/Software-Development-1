import java.util.Scanner;
public class Exercise5{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int counter = 1;

        for(int i=1; i <= 4; i++){
            for(int j=1; j <= 4; j++){
                System.out.print("\t");
                if(j <= 4-i){
                System.out.print(" ");
                }else {
                    System.out.print(j);
                }
                
            }
            System.out.println();
        }
        
    }
}
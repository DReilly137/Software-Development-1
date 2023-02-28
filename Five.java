import java.util.Scanner;
public class Five{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        
        for(int i=1; i<=50; i++){
            if(i % 5 == 0){
                System.out.print(i+", ");
            }
        }

    }
}
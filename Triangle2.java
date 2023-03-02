import java.util.Scanner;
public class Triangle2{

    public static void main(String[] args){
    Scanner input = new Scanner (System.in);


        for(int rows=8; rows>0; rows--){
           for(int columns=0; columns<rows; columns++){
               System.out.print("+ ");
           }
           System.out.println();
        }
        
    }
}
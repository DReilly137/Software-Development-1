import java.util.Scanner;
public class NestedLoopTwos{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        for(int row=1; row <= 5; row++){
            for(int column=1; column <= 3; column++){
                if(column <3){
                    System.out.print("2, ");
                }else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }

    }
}
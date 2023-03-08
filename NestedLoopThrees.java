import java.util.Scanner;
public class NestedLoopThrees{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        for(int row=1; row <= 1; row++){
            for(int column=1; column <= 5; column++){
                if(column <5){
                    System.out.print("3, ");
                }else{
                    System.out.print("3");
                }
            }
            System.out.println();
        }

    }
}
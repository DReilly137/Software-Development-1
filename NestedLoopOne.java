import java.util.Scanner;
public class NestedLoopOne{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        for(int row=1; row <= 5; row++){
            for(int column=1; column <= 3; column++){
                System.out.print("1 ");
            }
            System.out.println();
        }

    }
}
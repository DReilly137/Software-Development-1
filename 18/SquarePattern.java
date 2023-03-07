import java.util.Scanner;
public class SquarePattern{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int size;

        System.out.print("Enter the size: ");
        size = input.nextInt();

        for(int rows = 1; rows <= size; rows++){
            for(int columns = 1; columns <=size; columns++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
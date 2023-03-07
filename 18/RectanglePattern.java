import java.util.Scanner;
public class RectanglePattern{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int r, c;

        System.out.print("Enter numbers of rows: ");
        r = input.nextInt();

        System.out.print("Enter numbers of coloumns: ");
        c = input.nextInt();

        for(int rows = 1; rows <= r; rows++){
            for(int columns = 1; columns <=c; columns++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
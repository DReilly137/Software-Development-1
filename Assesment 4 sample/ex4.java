import java.util.Scanner;
public class ex4{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        for(int row=1; row <=6; row++){
            System.out.print("row "+row+": ");
            for(int column=1; column <=4; column++){
                System.out.print("column "+column+" ");
            }
            System.out.println();
        }

    }
}
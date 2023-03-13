import java.util.Scanner;
public class NestedLoopThrees{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int choice, r=1, i=2;

        System.out.print("Have 1 row, need another? Enter 0 for no: ");
        choice = input.nextInt();

        while(choice == 1){
            r+=1;
            System.out.print("Have "+i+" rows, need another? Enter 0 for no: ");
            choice = input.nextInt();
            ++i;
        }

        for(int row=1; row <= r; row++){
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
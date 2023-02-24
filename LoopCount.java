import java.util.Scanner;
public class LoopCount{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=0;
        int loop=0;

        System.out.print("Want to loop: (0 for yes, 1 for no): ");
        loop = input.nextInt();

        while(loop != 1){
            System.out.print("Loop again? (0 for yes, 1 for no): ");
            loop = input.nextInt();
            i++;
        }

        if(i !=0){
            System.out.println("You looped: "+i+" times.");
        }
        

        input.close();

    }
}
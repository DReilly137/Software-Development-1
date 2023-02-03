import java.util.Scanner;
public class SoftDevLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 0;
        int counter = 1;

        while(i < 30){
            System.out.println(+counter);
            ++i;
            ++counter;
        }
        while(i = 4){
            System.out.println("Soft");
            ++i;
            ++counter;
        }

    }
}
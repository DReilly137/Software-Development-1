import java.util.Scanner;
public class Reverse{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=0;
        int counter=10;

        while(i<10){
            System.out.println(+counter);
            ++i;
            --counter;
        }

    }
}
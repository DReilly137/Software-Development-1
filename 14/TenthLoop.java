import java.util.Scanner;
public class TenthLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 0, square, cube;

        
        System.out.println("number\tsquare\tcube");

        while(i < 11){
            square = i*i;
            cube = i*i*i;
            System.out.println(i+"\t"+square+"\t"+cube);
            ++i;
        }

    }
}
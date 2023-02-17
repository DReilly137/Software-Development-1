import java.util.Scanner;
public class SquareArithmetic{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 1, square, total=0;
        String output = "";
        output += "--------------\n";
        output += "Number\tSquare\n";
        output += "--------------\n";

        while(i<=10){
            square = i*i;
            output += i+"\t"+square+"\n";
            total += square;
            ++i;
        }
        output += "-------------\n";
        output += "Total\t"+total+"\n";
        output += "-------------\n";
        System.out.print(output);
    }
}
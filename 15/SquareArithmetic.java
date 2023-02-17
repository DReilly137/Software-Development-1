import java.util.Scanner;
public class SquareArithmetic{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 1, square, total=0;

        System.out.println("--------------");
        System.out.println("number\tsquare");
        System.out.println("--------------");
        //total = (1*1)+(2*2)+(3*3)+(4*4)+(5*5)+(6*6)+(7*7)+(8*8)+(9*9)+(10*10);
        while(i<=10){
            square = i*i;
            System.out.println(i+"\t"+square);
            total += square;
            ++i;
        }
        System.out.println("-------------");
        System.out.println("Total\t"+total);
        System.out.println("-------------");
    }
}
import java.util.Scanner;
public class Odd{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int sum=0;

        for(int n=1; n<=15; n+=1){
            sum+=n;
        }
        System.out.println(sum);

    }
}
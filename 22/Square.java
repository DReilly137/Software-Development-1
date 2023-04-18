import java.util.Scanner;
public class Square{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        for(int i=2; i<=7; i++){
            System.out.println(i + "\t" + squareof(i));
        }
        System.out.println();

    }

    static int squareof(int a){
        int result = a*a;
        return result;
    }

    
}
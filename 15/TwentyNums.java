import java.util.Scanner;
public class TwentyNums{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i=1;
        while (i<=20){
            if(i==1){
            System.out.print(i+" ");
            i++;
            }else{
                System.out.print("+ "+ i + " ");
                i++;
            }

        }
        

    }
}
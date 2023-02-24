import java.util.Scanner;
public class Odd{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int sum=0;

        for(int i=1; i<=15; i++){
            if(i%2!=0){
                sum+=i;
            }
            }
            
        
        System.out.println(sum);

    }
}
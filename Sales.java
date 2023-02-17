import java.util.Scanner;
public class Sales{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        double item1=239.99, item2=129.75, item3=99.96, item4=350.89;
        int product;
        double sum=0;

        for(int i=1; i<=4; i++){
            System.out.print("Enter number sold of product item " +i+": ");
            product=input.nextInt();
            if(i == 1){
                sum += product*item1;                
            }
            else if(i == 2){
                sum += product*item2;
            }
            else if(i == 3){
                sum += product*item3;
            }
            else{
                sum += product*item4;
            }

        }
        double earnings = 200 + 0.09*sum;
        System.out.println("Earnings this week: " + sum);
        System.out.println("Earnings this week: "+Math.round(earnings));

    }
}
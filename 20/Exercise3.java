import java.util.Scanner;
public class Exercise3{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter number: ");
        n = input.nextInt();

        if(n >= 5 && n <= 10){
            n+=10;
        }else if(n >= 15 && n <= 20){
             n+=20;
        }else if(n >= 25 && n <= 30){
             n+=30;
        }else if(n >= 35 && n <= 40){
             n+=40;
        }else if(n >= 45 && n <= 50){
             n+=50;
        }else{
            n+=5;
        }

        System.out.println("Number updated to: "+n);
        input.close();
    }
}
import java.util.Scanner;
public class Exercise2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("Enter number: ");
        n = input.nextInt();

        if(n >=5 && n <=12){
            n-=5;
        }else if(n >=25 && n <=32){
            n-=25;
        }else if(n >=45 && n <=52){
            n-=45;
        }else{
            n-=2;
        }
        System.out.println("Number updated to: "+n);
        input.close();
    }
}
import java.util.Scanner;
public class EvenOdd{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;
        String cont;

        do{
            System.out.print("Enter a number: ");
            n = input.nextInt();
            if(n % 2 == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
            System.out.print("Enter y to continue: ");
            cont = input.next();
            if(cont.equals("n"))
                break;
        }while(true);


    }
}
import java.util.Scanner;
public class EvenOdd{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String c = null;
        int i=1;
        int n;
        do{
            System.out.print("Enter a number: ");
            n = input.nextInt();

            while(i <= 1){
                if(n % 2 == 0){
                    System.out.print("even");
                }
                i++;
            }

            System.out.print("\nTry Again? Y/N: ");
            c = input.next();
        }while(c.equalsIgnoreCase("y"));


    }
}
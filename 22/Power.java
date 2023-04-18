import java.util.Scanner;
public class Power{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        System.out.println(powerof(n1, n2));
    
}

        static int powerof(int a, int b){
            int mult=1;
            for(int i = 0; i < b; i++){
                mult *= a;
            }
            return mult;
            
        }


}
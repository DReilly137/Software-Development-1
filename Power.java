import java.util.Scanner;
public class Power{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter first number: ")
        n1 = input.nextInt();
        System.out.print("Enter second number: ")
        n2 = input.nextInt();

        System.out.println(powerof());
    
}

        static int powerof(int a, int b){
            int mult=1;
            for(int i = 0; i < b; i++){
                mult *= a;
            }
            return mult;
            
        }


}
import java.util.Scanner;
 
public class Exercise4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
         
        for (int i = 1; i < 3; i++){
            for(int j=2-i; j>0; --j){
                System.out.print(j+" ");
            }
            for(int k=3-i; k<=3; k++){
                System.out.print();
            }
            System.out.println();
        }
 
        input.close();
    }
}
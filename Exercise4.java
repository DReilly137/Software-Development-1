import java.util.Scanner;
 
public class Exercise4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int rows = 3;
         
        for (int i = 1; i <= rows; i++)
        {
            for (int number = 1; number <= rows-i; number++)
            {
                System.out.print(" ");
            }
 
            for (int number = i; number < 2*i; number++)
            {
                System.out.print(number+" ");
            }
 
            System.out.println();
        }
 
        input.close();
    }
}
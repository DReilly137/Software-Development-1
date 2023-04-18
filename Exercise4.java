import java.util.Scanner;
 
public class Exercise4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int rows =3;
         
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }
 
            for (int j = i; j < 2*i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 
        input.close();
    }
}
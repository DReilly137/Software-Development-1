import java.util.Scanner;
public class ThirdLoop{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int i = 0;
        int counter = 1;

        while(i < 10){
            System.out.println(+counter+". Darren");
            ++i;
            ++counter;
        }

    }
}
import java.util.Scanner;
public class Exercise5{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int [] x = {100, 200, 300, 400};

        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i = 0; i < x.length; i++){
            System.out.println(i+"\t"+x[i]);
        }
        System.out.println();

        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i = 0; i < x.length; i++){
            System.out.println(i+"\t"+x[i]*3);
        }
        System.out.println();

    }
}
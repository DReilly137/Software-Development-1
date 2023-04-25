import java.util.Scanner;
public class Exercise5{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int [] x = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i=0; i < x.length; i++){
            System.out.println(i+"\t"+x[i]*10);
        }
        System.out.println();
        input.close();

    }
}

//Darren Reilly - 25/04/2023//
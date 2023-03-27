import java.util.Scanner;
public class Names{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String [] names = new String[3];

        for(int i=0; i< 3; i++){
            System.out.print("Enter name: ");
            names[i] = input.nextLine();
        }
        input.close();

        System.out.println();
        System.out.println("Names");
        System.out.println("-----");
        for(int i=0; i<3; i++){
            System.out.println(names[i]);
        }

    }
}
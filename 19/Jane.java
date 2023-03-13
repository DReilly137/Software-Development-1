import java.util.Scanner;
public class Jane{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String name = "Jane", course = "English", uni = "NUIG", career = "journalist";
        int age = 20;

        System.out.println(name+" is "+age+" years old and is studying "+course+" in "+uni+".");
        System.out.println("Some day she hopes to be a "+career);

    }
}
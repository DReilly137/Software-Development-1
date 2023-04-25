import java.util.Scanner;
public class Exercise3{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        if(age >= 50 ){
            System.out.println("Master");
        }else if(age >= 40){
            System.out.println("Senior");
        }else if(age >= 20){
            System.out.println("Intermediate");
        }else{
            System.out.println("Junior");
        }


    }
}

//Darren Reilly - 25/04/2023//
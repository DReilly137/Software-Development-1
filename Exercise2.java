import java.util.Scanner;
public class Exercise2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter team finishing position: ");
        int val = input.nextInt();

        if(val == 1){
            System.out.println("Your team are League Champions and qualify for the Champions League");
        }else if(val == 2 || val == 3 || val == 4){
            System.out.println("Your team qualifies for the Champions League");
        }else if(val == 5 || val == 6 || val == 7){
            System.out.println("Your team qualifies for the Europa League");
        }else if(val == 18 || val == 19 || val == 20){
            System.out.println("Your team is relegated");
        }else if(val >= 8 && val <= 17){
            System.out.println("Your team qualifies for nothing but stays in the league");
        }else{
            System.out.println("Not possible to finish in such a position - it is a 20 team league");
        }

    }
}

//Darren Reilly - 25/04/2023
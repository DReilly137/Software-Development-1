import java.util.Scanner;
public class WhichNumber{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if(number == 0){
            System.out.println("0");
        }
        else {
            if(number == 1){
                System.out.println("1");
            }
            else {
                if(number == 2){
                    System.out.println("2");
                }
                else {
                    if(number == 3){
                        System.out.println("3");
                    }
                    else {
                        System.out.println("Not allowed");
                    }
                }
            }
        }

        }

    }
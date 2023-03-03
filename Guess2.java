import java.util.Scanner;
public class Guess2{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number = 5;
        int i=1, guess;
        String choice;

        for(;;){
            System.out.print("Guess the number: ");
            guess = input.nextInt();

            if(number == guess){
                System.out.println("good guess. It is "+number+". It took you "+i+" attempts to guess the number.");
                System.out.print("play again? (y/n): ");
                choice = input.next();
                if(choice.equals("n")){
                    System.out.println("Game Over");
                    break;
                }else if(choice.equals("y")){
                    number+=2;
                    i=1;
                }
            }else if(number != guess){
                ++i;
            }
        }          
        
    }
}
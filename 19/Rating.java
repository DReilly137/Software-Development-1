import java.util.Scanner;
public class Rating{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int rating;

        System.out.print("Enter a rating for a book you just read (any value from 1 to 5): ");
        rating = input.nextInt();

        System.out.println();

        if(rating == 1){
            System.out.println("You gave the book you just read a rating of 4, which indicates you think the book is poor.");
        }else if(rating == 2){
            System.out.println("You gave the book you just read a rating of 4, which indicates you think the book is not great.");
        }else if(rating == 3){
            System.out.println("You gave the book you just read a rating of 4, which indicates you think the book is ok.");
        }else if(rating == 4){
            System.out.println("You gave the book you just read a rating of 4, which indicates you think the book is very good.");
        }else if(rating == 5){
            System.out.println("You gave the book you just read a rating of 4, which indicates you think the book is excellent.");
        }else{
            System.out.println("Invalid rating (any value from 1 to 5)");
        }
        input.close();

    }
}
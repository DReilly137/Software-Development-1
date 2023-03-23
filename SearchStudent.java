import java.util.Scanner;
public class SearchStudent{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String[][] students = {
            {"Mary Reilly", "Sofware Development", "Year 1", "ATU"},
            {"Garrett Winters", "Business Studies", "Year 3", "TUS"},
            {"Ashley Cox", "Chemistry", "Year 3", "UCC"},
            {"Joe Kelly", "Computing and Digital Media", "Year 2", "ATU"}
        };
        System.out.print("Please enter a search value: ");
        String which = input.nextLine();

    }
}
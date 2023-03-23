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
        String find = input.nextLine();

        int matches = 0;
        boolean found = false;
        for(int i=0; i < students.length; i++){
            for(int j=0; j < students[i].length; j++){
                if(students[i][j].equals(find)){
                    System.out.println(students[i][0]+"\t"+students[i][3]);
                    found = true;
                    matches++;
                    break;
                }
            }
        }
        if(!found){
            System.out.println();
            System.out.println("Records with match: "+matches);
        }else{
            System.out.println();
            System.out.println("Records with match: "+matches);
        }
    }
}
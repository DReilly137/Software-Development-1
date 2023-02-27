import java.util.Scanner;
public class Password{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String pass;
        boolean valid;

        do{
            System.out.print("enter password: ");
            pass=input.next();
            valid = pass.equals("mypass");
            if(!valid){
                System.out.print("enter password: ");
                pass=input.next();
            }
        }while(!valid);
        if(valid){
                System.out.println("valid!");
            }
        

        
        input.close();

    }
}
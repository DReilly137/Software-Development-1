import java.util.Scanner;
public class Login{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int id;
        String user;

        System.out.print("Enter id: ");
        id = input.nextInt();
        System.out.print("Enter username: ");
        user = input.next();

        if (id == 1000 && user.equals("user1") || id == 2000 && user.equals("user2")){
            System.out.println("login ok");
        }else{
            System.out.println("access denied");
        }

    }
}
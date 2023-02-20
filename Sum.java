import java.util.Scanner;
public class Sum{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int Number, Reminder, total = 0;		
		System.out.println("Please Enter any Number: ");
		Number = input.nextInt();
		
		for (total = 0; Number > 0; Number = Number/10){
			Reminder = Number % 10;
			total = total + Reminder;
		}
		System.out.format("Sum of the digits of Given Number = %d" + total);

    }
}
import java.util.Scanner;
public class Buffet{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int age;
        int weight;
        double price;

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        if(age < 6){
            System.out.println("It is free to eat all you want from the buffet");
        }else if(age >= 6 && age <= 15){
            System.out.print("Please enter your weight (lbs): ");
            weight = input.nextInt();
            price = 0.09 * weight;
            System.out.println("It will cost "+price+" to eat all you want from the buffet.");
        }else if(age >=16 && age <= 59){
            System.out.println("It will cost 10.95 to eat all you want from the buffet");
        }else if(age >= 60){
            System.out.println("It will cost 8.90 to eat all you want from the buffet");
    }
}
}
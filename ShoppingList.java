import java.util.Scanner;
public class ShoppingList{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n;

        System.out.print("How many items do you need to add to your shopping list: ");
        n=input.nextInt();
        System.out.println();

        String[] array = new String[100];

        for(int i=1; i<=n; i++){
            System.out.print("Add item "+i+" to shopping list: ");   
            array[i]=input.next();  
        }
        System.out.println();
        System.out.println("Shopping list: ");
        System.out.println();
        for (int i=1; i<=n; i++)   
        {  
        System.out.println(i+". "+array[i]);  
        }  

    }
}
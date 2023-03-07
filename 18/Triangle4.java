public class Triangle4{

    public static void main(String[] args){

        for(int i = 10; i > 0; i--){
	            for(int space=0; space < i-1; space++)
	                System.out.print(" ");

	            for(int star=10; star > i-1; star--)
	                System.out.print("*");
	            System.out.println();
	        } 
    }
}
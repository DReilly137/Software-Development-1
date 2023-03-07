public class Triangle3{

    public static void main(String[] args){

        for(int i = 0; i < 10; i++){
	            for(int space=1; space < i+1; space++)
	                System.out.print(" ");

	            for(int star=10; star > i; star--)
	                System.out.print("*");
	            System.out.println();
	        } 
    }
}
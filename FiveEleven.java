import java.util.Scanner;
public class FiveEleven{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String output="", output5="", output11="";

        for(int i=1; i<=50; i++){
            if(i % 5 == 0){
                if(output5.length() == 0){
                    output5 += i;
                }else{
                    output5 += ", "+i;
                }if(output.length() == 0){
                    output += i;
                }else{
                    output += ", "+i;
                }
            }
            if(i % 11 == 0){
              if(output11.length() == 0){
                    output11 += i;
                }else{
                    output11 += ", "+i;
                }if(output.length() == 0){
                    output += i;
                }else{
                    output += ", "+i;
                }  
            }
            if(i % 11 == 0 && i % 5 == 0){
              if(output11.length() == 0){
                    output11 += i;
                }else{
                    output11 += ", "+i;
                }if(output.length() == 0){
                    output += i;
                }else{
                    output += ", "+i;
                }  
            }
        }

        System.out.println("Divisible by 5:");
        System.out.println(output5);

        System.out.println("Divisible by 11:");
        System.out.println(output11);
        
    }
}
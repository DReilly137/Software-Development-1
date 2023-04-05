import java.util.Scanner;
public class Exercise8{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(prepareOutput(array));

    }

    static String prepareOutput(int[] array){
        StringBuilder str = new StringBuilder();
        str.append("Index\tValue\tSquare\n");
        str.append("=====\t=====\t=====\n");
        for(int i = 0; i < array.length; i++){
            int squared = array[i] * array[i];
            str.append(i+"\t"+array[i]+"\t"+squared+"\n");
            }
            return str.toString();
        }
        
    }
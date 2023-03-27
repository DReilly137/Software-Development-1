import java.util.Arrays;
public class NinthArray{

    public static void main(String[] args){

        int[] first = {1,2,3,4};
        int[] second = {1,2,3,4};
        int [] third = {1,2,67,4};

        System.out.println("Is first arrat equal to second array : " +
                                Arrays.equals(first, second));
        System.out.println("Is first array equal to third array : " +
                                Arrays.equals(first, third));

    }
}
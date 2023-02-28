public class NestedLoop{

    public static void main(String[] args){
        for(int rows = 1; rows <= 2; rows++){
            for(int columns = 1; columns <=3; columns++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
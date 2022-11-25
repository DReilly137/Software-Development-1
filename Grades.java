import java.util.Scanner;
public class Grades{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String id1, id2, id3, id4, id5, id6, id7, id8, id9, id10;
        int g1, g2, g3, g4, g5, g6, g7, g8, g9, g10;
        int total;
        double avg;

        System.out.print("Enter student id 1: ");
        id1=input.next();
        System.out.print("Enter grade for student 1:");
        g1=input.nextInt();
        System.out.print("Enter student id 2: ");
        id2=input.next();
        System.out.print("Enter grade for student 2:");
        g2=input.nextInt();
        System.out.print("Enter student id 3: ");
        id3=input.next();
        System.out.print("Enter grade for student 3:");
        g3=input.nextInt();
        System.out.print("Enter student id 4: ");
        id4=input.next();
        System.out.print("Enter grade for student 4:");
        g4=input.nextInt();
        System.out.print("Enter student id 5: ");
        id5=input.next();
        System.out.print("Enter grade for student 5:");
        g5=input.nextInt();
        System.out.print("Enter student id 6: ");
        id6=input.next();
        System.out.print("Enter grade for student 6:");
        g6=input.nextInt();
        System.out.print("Enter student id 7: ");
        id7=input.next();
        System.out.print("Enter grade for student 7:");
        g7=input.nextInt();
        System.out.print("Enter student id 8: ");
        id8=input.next();
        System.out.print("Enter grade for student 8:");
        g8=input.nextInt();
        System.out.print("Enter student id 9: ");
        id9=input.next();
        System.out.print("Enter grade for student 9:");
        g9=input.nextInt();
        System.out.print("Enter student id 10: ");
        id10=input.next();
        System.out.print("Enter grade for student 10:");
        g10=input.nextInt();

        System.out.println("-------------------------");
        System.out.println("|#  |Student    |Grade    |");
        System.out.println("-------------------------");
        System.out.println("|1  |"+id1+"    |"+g1+"   |");
        System.out.println("-------------------------");
        System.out.println("|2  |"+id2+"    |"+g2+"   |");
        System.out.println("-------------------------");
        System.out.println("|3  |"+id3+"    |"+g3+"   |");
        System.out.println("-------------------------");
        System.out.println("|4  |"+id4+"    |"+g4+"   |");
        System.out.println("-------------------------");
        System.out.println("|5  |"+id5+"    |"+g5+"   |");
        System.out.println("-------------------------");
        System.out.println("|6  |"+id6+"    |"+g6+"   |");
        System.out.println("-------------------------");
        System.out.println("|7  |"+id7+"    |"+g7+"   |");
        System.out.println("-------------------------");
        System.out.println("|8  |"+id8+"    |"+g8+"   |");
        System.out.println("-------------------------");
        System.out.println("|9  |"+id9+"    |"+g9+"   |");
        System.out.println("-------------------------");
        System.out.println("|10 |"+id10+"   |"+g10+"  |");
        System.out.println("-------------------------");
        input.close();

    }
}
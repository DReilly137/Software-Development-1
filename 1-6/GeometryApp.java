import java.util.Scanner;

public class GeometryApp{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int rec1;
        int rec2;
        int sum1;
        int circle;
        double sum2;
        int square;
        int sum3;
        int tri1;
        int tri2;
        int sum4;
        String unit;

        System.out.println("Use this app to calculate the area of: "+
                           "Rectangles, Circles, Triangles and Squares.");
        
        System.out.print("Enter the length of the rectangle: ");
        rec1 = input.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        rec2 = input.nextInt();

        sum1 = rec1 * rec2;
        System.out.println("Area of rectangle is " + sum1);

        System.out.print("Enter the radius of a circle: ");
        circle = input.nextInt();

        sum2 = circle * circle * 3.1415926535;
        sum2 = Math.round(sum2 * 100.0) / 100.0;
        System.out.println("Area of circle is: " + sum2);

        System.out.print("Enter length and width of the square: ");
        square = input.nextInt();

        sum3 = square * square;
        System.out.println("Area of the square is: " + sum3);

        System.out.print("Enter the length of the base of the triangle: ");
        tri1 = input.nextInt();

        System.out.print("Enter the heigtht of the triangle: ");
        tri2 = input.nextInt();

        sum4 = tri1 * tri2 / 2;
        System.out.println("Area of triangle is: " + sum4);

        System.out.print("What is the unit of measurement for all these shapes? ");
        unit = input.next();

        System.out.println("All area calculation results for areas of shapes are in " + unit);



    }
}
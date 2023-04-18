import java.util.Scanner;
public class StaticMethods{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        method1();
        method2();
        method3(4);
        method4(10, 20);
        method5(10,20,30);

        System.out.print("Enter first name: ");
        String first = input.next();
        System.out.print("Enter last name: ");
        String last = input.next();

        method6(first, last);
        method7("Darren", 20);
        System.out.println("method8 returned a value of "+method8()+" to me");
        System.out.println(method9("John","Smith"));
        System.out.println(method10(4,6,10));
        
    }

    static void method1(){
        System.out.println("Hello from method1");
    }

   static void method2(){
        System.out.println("Hello from method2");
    }

    static void method3(int a){
        System.out.println("You passed a value of "+ a);
    }

    static void method4(int a, int b){
        System.out.println("You passed me, method4, integer values of: "+a+" and "+b);
    }

    static void method5(int a, int b, int c){
        System.out.println("You passed me, method5, integer values of: "+a+", "+b+" and "+c);
    }

    static void method6(String first, String last){
        System.out.println("You passed me, method6, the name: "+first+" "+last);
    }

    static void method7(String a, int b){
        System.out.println("You passed me, method7, the name "+a+" and the number "+b);
    }

    static int method8(){
        return 1000;
    }

    static String method9(String first, String last){
        String name = first + " " + last;
        return name;
    }

    static int method10(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }


}
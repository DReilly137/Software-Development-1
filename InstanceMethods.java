import java.util.Scanner;
public class InstanceMethods{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        InstanceMethods im = new InstanceMethods();

        im.method1();
        im.method2();
        im.method3(4);
        im.method4(10, 20);
        im.method5(10,20,30);

        System.out.print("Enter first name: ");
        String first = input.next();
        System.out.print("Enter last name: ");
        String last = input.next();

        im.method6(first, last);
        im.method7("Darren", 20);
        System.out.println("method8 returned a value of "+im.method8()+" to me");
        System.out.println(im.method9("John","Smith"));
        System.out.println(im.method10(4,6,10));
        
        
    }

    void method1(){
        System.out.println("Hello from method1");
    }

    void method2(){
        System.out.println("Hello from method2");
    }

    void method3(int a){
        System.out.println("You passed a value of "+ a);
    }

    void method4(int a, int b){
        System.out.println("You passed me, method4, integer values of: "+a+" and "+b);
    }

    void method5(int a, int b, int c){
        System.out.println("You passed me, method5, integer values of: "+a+", "+b+" and "+c);
    }

    void method6(String first, String last){
        System.out.println("You passed me, method6, the name: "+first+" "+last);
    }

    void method7(String a, int b){
        System.out.println("You passed me, method7, the name "+a+" and the number "+b);
    }

    int method8(){
        return 1000;
    }

    String method9(String first, String last){
        String name = first + " " + last;
        return name;
    }

    int method10(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }








}
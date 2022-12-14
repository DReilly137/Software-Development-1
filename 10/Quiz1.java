import java.util.Scanner;
public class Quiz1{

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int val = 0;
        String answer;
        int total = 0;

        System.out.println("The following code produces which output to the screen:");
        System.out.println();// skip a line
        System.out.println("int x = 65");
        System.out.println("int x > 65");
        System.out.println("System.out.println(x)");
        System.out.println("}");
        System.out.println();
        System.out.println("1. 65");
        System.out.println("2. Nothing is printed to the screen");
        System.out.print("Enter answer 1 or 2: ");
        val = input.nextInt();
        input.nextLine();

        if(val == 2){
            System.out.println("Correct");
            total = total + 1;
        }else{
            System.out.println("Incorrect");
        }

        

        System.out.println("Write a line of java code to assign an instance of the Scanner object for user input to a variable named sc");
        System.out.println();// skip a line
        System.out.print("Enter answer:");
        val = input.nextLine();

        if(answer.equals ("Scanner sc = new Scanner(System.in)")){
            System.out.println("Correct");
            total = total + 1;
        }else{
            System.out.println("Incorrect");
        }


        System.out.println("What will be the output of the following code?");
        System.out.println();// skip a line
        System.out.println("int x = 1");
        System.out.println("int y = 2");
        System.out.println();
        System.out.println("if (x == 1 && y == 2) {");
        System.out.println("System.out.println(true);");
        System.out.println("} else {");
        System.out.println("System.out.println(false);");
        System.out.println("}");
        System.out.println();
        System.out.println("1. false");
        System.out.println("2. true");
        System.out.println("3. no output");
        System.out.print("Enter answer 1, 2 or 3: ");

        val = input.nextInt();

        if(val == 2){
            System.out.println("Correct");
            total = total +1;
        }else{
            System.out.println("Incorrect");
        }


        System.out.println("What will be the output of the following code?");
        System.out.println();// skip a line
        System.out.println("int x = 1");
        System.out.println();
        System.out.println("if (x != 1) {");
        System.out.println("System.out.println(\"not equal to 1\");");
        System.out.println("} else {");
        System.out.println("System.out.print(\"equal to 1\");");
        System.out.println("}");
        System.out.println();
        System.out.println("1. not equal to 1");
        System.out.println("2. equal to 1");
        System.out.println("3. no output");
        System.out.println("4. error");
        System.out.println();
        System.out.print("Enter 1, 2, 3 or 4: ");
        

        val = input.nextInt();

        if(val == 2){
            System.out.println("Correct");
            total = total +1;
        }else{
            System.out.println("Incorrect");
        }

        System.out.println("How many choices are possible when using a single if-else statement?");
        System.out.println();// skip a line
        System.out.println("Select one:");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.print("Enter 1, 2, 3 or 4: ");
        

        val = input.nextInt();

        if(val == 2){
            System.out.println("Correct");
            total = total +1;
        }else{
            System.out.println("Incorrect");
        }



        int grade = (total * 100) / 5;
        System.out.println("result: " + grade + "%");
        if(grade >= 80){
            System.out.println("Your grade is a Distinction");
        }else{
            if(grade >= 40){
                System.out.println("Your grade is a Pass");
            }else{
                if(grade <= 40){
                    System.out.println("Your grade is a fail");
                }
            }
        }

        
    }
}
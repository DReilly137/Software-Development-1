public class StringExample{

    public static void main(String[] args){

        String name = "Darren Reilly";
        String prefix = "Mr ";

        System.out.println("number of characters in name" + name.length());

        System.out.println("Surname" + name.substring(0));
        System.out.println("First name" + name.substring(0, 5));

        System.out.println(prefix.concat(" ").concat(name));

        System.out.println("Name not exist: " + name.isEmpty());
        
        System.out.println("Second character in name" + name.charAt(1));
        System.out.println("Last character in name" + name.charAt(name.length() - 1));

        System.out.println("Darren equals Darren" + "Darren".equals("Darren")); 
        
    }
}
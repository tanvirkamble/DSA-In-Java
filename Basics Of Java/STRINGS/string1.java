import java.util.*;


public class string1 {

    public static void main (String argd[]){
        // Declaration
        // String name = "Tony";
        
        // Taking Input
        Scanner sc = new Scanner(System.in);
            String name = sc.next();
            System.out.println(name);

        
        // Concatenation (Joining 2 strings)
        String firstName = "Tony";
          String secondName = "Stark";
               
               
           String fullName = firstName + " " + secondName;
            System.out.println(fullName);
        
        // Access characters of a string
                  
            for(int i=0; i<fullName.length(); i++) {
                System.out.println(fullName.charAt(i));
         }
        
         sc.close();
        }

}

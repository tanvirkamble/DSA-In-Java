package BasicsOFJava.STRINGS;

public class string6 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Apna College");
        // Declaration
            System.out.println(sb);
        //Set Char
            System.out.println(sb.charAt(0));
        //Get Char
            sb.setCharAt(0, 'P');
            System.out.println(sb);
        //Insert char
            sb.insert(0, 'S');
            System.out.println(sb);
        //delete char
            sb.delete(0, 1);
            System.out.println(sb);
        //Append a char 
            sb.append(" Stark");
            System.out.println(sb);
        // Print Length of String
            System.out.println(sb.length());
    }
}

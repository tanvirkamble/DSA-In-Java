package BasicsOFJava.STRINGS;

public class string7 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("mad");

        //reverse the string to  hello = > olleh

        for (int index = 0; index < sb.length()/2; index++) { // reducing the string(length/2) to half is imp
            int firstChrPosition = index; 
            int lastChrPosition = sb.length()-1-index; 

             char firstCharacter = sb.charAt(firstChrPosition);
             char lastCharacter  = sb.charAt(lastChrPosition);


             //string.setCharAt(index,string)
             sb.setCharAt(firstChrPosition, lastCharacter);//oll
             sb.setCharAt(lastChrPosition, firstCharacter);//he
            }
            System.out.println(sb);
            //olleh
    }
    
}

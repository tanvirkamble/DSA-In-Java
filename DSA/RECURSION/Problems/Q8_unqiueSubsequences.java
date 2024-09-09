package RECURSION.Problems;

import java.util.HashSet;

public class Q8_unqiueSubsequences {
// time complexity O((2)^n)  

    public static void subSeq(int i, String x,String y,HashSet<String> set){

        if (i == x.length()) {
            // is set contains the combination it doesnt print it 
            if (set.contains(y)) {
                return;
            } else {
            //it does
               System.out.print(y+", ");
            // adds the combn to the set   
               set.add(y);
               return;
            }
        }
      char CurrentChar = x.charAt(i);
      
      subSeq(i+1,x, y+CurrentChar,set);
      subSeq(i+1,x, y,set);
    }
    public static void main(String args[]){
     HashSet<String> set = new HashSet<>();
     subSeq(0, "aaaaa", "",set);
    }


}
/* 
 output for aaaaa:
aaaaa,aaaa,aaa,aa,a
*/

/*
 output for aaaaacc:
aaaaacc,aaaaac,aaaaa,aaaacc,aaaac,aaaa,aaacc,aaac,aaa,aacc,aac,aa,acc,ac,a,cc,c
 */
/*
 output for adc:
adc,ad,ac,,a,dc,d,c
 */

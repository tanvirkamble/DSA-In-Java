package DSA.RECURSION.Problems;

public class Q7_Subsequences { 
// time complexity O((2)^n)  

    public static void subSeq(int i, String x,String y){

        if (i == x.length()) {
            System.out.println(y);
            return;
        }
      char CurrentChar = x.charAt(i);
      
      subSeq(i+1,x, y+CurrentChar);
      subSeq(i+1,x, y);
    }
    public static void main(String args[]){
     subSeq(0, "adc", "");
    }
}
/*
output:
adc
ad
ac
a
dc
d
c */

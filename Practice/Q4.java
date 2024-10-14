package Practice;

public class Q4 {
    public static int matrix(int mat [][]){
        int r = mat.length;
        int c = mat[0].length;

        int maxOneCount = 0, theRowWitheMaxOne = 0;
        
        boolean flag = true ;
        for (int i = 0; i < r; i++) {
            int count = 0; // count of one for that row
            for (int j = 0; j < c; j++) {
                if(mat[i][j] == 1){
                    count ++;
                    flag = false;
                }
            }
            if(count > maxOneCount){
                maxOneCount = count;
                theRowWitheMaxOne = i;
            }
        }
        
        if (flag) {
            return -1;
        }

        return theRowWitheMaxOne;
    }
    public static void main(String[] args) {
        
        int mat[][] = {{0, 0, 0, 0}};
        
        // int mat[][] = { {0, 0, 0, 1},
        //                 {0, 1, 1, 1},
        //                 {1, 1, 1, 1},
        //                 {0, 0, 0, 0}};
    
        System.out.print("Index of row with maximum 1s is " + matrix(mat));
        }
}

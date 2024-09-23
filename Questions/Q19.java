package Questions;

import java.util.ArrayList;
import java.util.List;

public class Q19 {
    public static List<Integer> spiralOrder(int[][]matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        if (m == 0)
            return result;

        boolean[][] seen = new boolean[m][n];

        // dr and dc arrays represent changes in the row and column indices for the four movement directions: right, down, left, and up.
        // -dr[0] and dc[0] correspond to moving right.
        // -dr[1] and dc[1] correspond to moving down.
        // -dr[2] and dc[2] correspond to moving left.
        // -dr[3] and dc[3] correspond to moving up.    
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};

        // r and c start at 0, representing the initial position in the matrix (top-left corner).
        // di is the direction index, starting at 0, which means we begin moving to the right.
        int r = 0, c = 0;
        int di = 0;


        for (int i = 0; i < m*n; i++) {
            result.add(matrix[r][c]);
            seen[r][c] = true;

            // Calculate Next Cell
            int newR = r + dr[di];
            int newC = c + dc[di];

            // if newR and newC is from 0 to m and 0 to n , also seen[newR][newC] != true
            if (0 <= newR && newR < m && 0 <= newC && newC < n && !seen[newR][newC]) {
                r = newR;
                c = newC;
            } else {
                di = (di + 1) % 4;
                r = r + dr[di];
                c = c + dc[di];
            }
        }

        return result;
    }
    public static void main(String[] args) {

        // Example matrix initialization
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // Function call to get the spiral order traversal
        List<Integer> result = spiralOrder(matrix);

        // Print the result elements
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
;
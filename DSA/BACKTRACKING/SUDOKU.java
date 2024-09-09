package BACKTRACKING;

public class SUDOKU {

    private static char[][] Qboard = {
        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };

    // Method to check if placing 'x' in board[row][col] is valid
    public boolean isSafe(char[][] board, int col, int row, int x) {
        // col - checking if the number x exists in the current column; if yes, return false
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (x + '0')) {
                return false;
            }
        }

        // row - checking if the number x exists in the current row; if yes, return false
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (x + '0')) {
                return false;
            }
        }

        // grid
        
        // Calculate the starting row and column indices of the 3x3 subgrid that contains the current cell (row, col).
        int startGridRow = (row / 3) * 3;
        int startGridCol = (col / 3) * 3;

        // Nested loop which goes through all rows and cols in the current grid and checks if the board[i][j] exists or not in that grid; if it does, return false
        for (int i = startGridRow; i < startGridRow + 3; i++) {
            for (int j = startGridCol; j < startGridCol + 3; j++) {
                if (board[i][j] == (char) (x + '0')) {
                    return false;
                }
            }
        }

        // If none of the condition checks return false, it means the position has a correct number.
        return true;
    }

    // Recursive function to solve the Sudoku
    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true; // Base case: Reached the end of the board
        }

        // Initialize the rows and cols at (0,0)
        int nrow = 0;
        int ncol = 0;

        // Check if the col is equal to board.length i.e 9 and increase the row by 1 till you reach nine
        if (col < board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            // After you reach the end of the col, increase the row by 1
            nrow = row + 1;
            ncol = 0; // Move to the start of the next row
        }

        // If the current cell is already filled (not '.'), skip it and recursively attempt to solve the next cell.
        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true; // If solving the next cells leads to a solution, return true.
            }
        } else { // if the spot is empty (== '.')

            // Try placing all the numbers from 1 to 9 in the empty space
            for (int i = 1; i <= 9; i++) {
                // Checks if it is safe to add the number according to the Sudoku conditions we mentioned
                if (isSafe(board, col, row, i)) {
                    // If isSafe returns true, convert the int i to char as per board data type
                    board[row][col] = (char) (i + '0');
                    // Moving to the next cell of row and col, checking the same as you can have this number at the position to be invalid or not
                    if (helper(board, nrow, ncol)) {
                        // If valid, return true; it is a valid solution and move forward
                        return true;
                    } else {
                        // If false, set '.' instead of the number to try a different number
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        SUDOKU sudokuSolver = new SUDOKU();

        System.out.println("Original Sudoku:");
        printBoard(Qboard);

        // Solve the Sudoku
        sudokuSolver.solveSudoku(Qboard);

        System.out.println("Solved Sudoku:");
        printBoard(Qboard);
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

/*
        Determine the top-left corner of the 3x3 subgrid that contains the cell at (row, col) in a Sudoku grid.
        The Sudoku grid is divided into 9 subgrids, each 3x3 in size, arranged as follows:

        Subgrid 1 | Subgrid 2 | Subgrid 3
        --------- | --------- | ---------
        Top-left  | Top-center| Top-right

        Subgrid 4 | Subgrid 5 | Subgrid 6
        --------- | --------- | ---------
        Middle-left| Middle-center| Middle-right

        Subgrid 7 | Subgrid 8 | Subgrid 9
        --------- | --------- | ---------
        Bottom-left| Bottom-center| Bottom-right

        Calculation:
        - Calculate the starting row of the subgrid:
        int startGridRow = (row / 3) * 3;
        For example, if row = 4:
        (4 / 3) * 3 = 1 * 3 = 3
        Thus, startGridRow = 3

        - Calculate the starting column of the subgrid:
        int startGridCol = (col / 3) * 3;
        For example, if col = 7:
            (7 / 3) * 3 = 2 * 3 = 6
            Thus, startGridCol = 6
            
            Subgrid Number Calculation:
            - Use the row and column indices to determine the subgrid number:
            Subgrid number = (row / 3) * 3 + (col / 3) + 1
            For example, if row = 4 and col = 7:
            Subgrid number = (4 / 3) * 3 + (7 / 3) + 1
            = 1 * 3 + 2 + 1
            = 3 + 2 + 1
            = 6
            Thus, cell (4,7) is in Subgrid 6
            
      
*/ 
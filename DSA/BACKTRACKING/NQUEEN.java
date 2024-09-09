package BACKTRACKING;
import java.util.*;

public class NQUEEN {

    private int boardCount = 0; // Counter for the number of solutions

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        
        // Convert each row of the board to a string and add to newBoard
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'Q') {
                    row.append('Q');
                } else if (board[i][j] == '.') {
                    row.append('.');
                } else {
                    // Handle unexpected characters
                    System.out.println("Unexpected character found: " + board[i][j]);
                }
            }
            newBoard.add(row.toString()); // Convert StringBuilder to string and add to newBoard
        }
        
        // Print the board for debugging purposes
        System.out.println("Saving board:");
        for (String s : newBoard) {
            System.out.println(s);
        }
        System.out.println();
        
        allBoards.add(newBoard); // Add newBoard to allBoards
        boardCount++; // Increment the board count
    }
    
    //check if the position is safe for Queen which returns either true or false
    public boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;
    
        // Check the same column (vertical)
        for (int i = 0; i < row; i++) {  // Only check rows above the current row
            if (board[i][col] == 'Q') {
                return false;
            }
        }
    
        // Check upper left diagonal
        for (int x = col, y = row; x >= 0 && y >= 0; x--, y--) {  // Move diagonally up-left
            if (board[y][x] == 'Q') {  // Note that we need to check board[y][x] not board[x][y]
                return false;
            }
        }
    
        // Check upper right diagonal
        for (int x = col, y = row; x < n && y >= 0; x++, y--) {  // Move diagonally up-right
            if (board[y][x] == 'Q') {  // Note that we need to check board[y][x] not board[x][y]
                return false;
            }
        }
    
        // Check lower left diagonal
        // Not necessary for this problem but included for completeness
        for (int x = col, y = row; x >= 0 && y < n; x--, y++) {  // Move diagonally down-left
            if (board[y][x] == 'Q') {  // Note that we need to check board[y][x] not board[x][y]
                return false;
            }
        }
    
        // Check lower right diagonal
        // Not necessary for this problem but included for completeness
        for (int x = col, y = row; x < n && y < n; x++, y++) {  // Move diagonally down-right
            if (board[y][x] == 'Q') {  // Note that we need to check board[y][x] not board[x][y]
                return false;
            }
        }
    
        // If no conflicts were found, the position is safe
        return true;
    }
    
    // recursive func
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                // move to next column
                helper(board, allBoards, col + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }
   
    public List<List<String>> solveNQueen(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.'); // Initialize the board with '.'
        }

        helper(board, allBoards, 0);
        return allBoards; 
    }

    public static void main(String[] args) {
        NQUEEN nQueen = new NQUEEN(); // Create an instance of the NQUEEN class
        int n = 4;  // Example: Solve for a 4x4 board
        List<List<String>> solutions = nQueen.solveNQueen(n); // Call solveNQueen method to get all solutions
    
        // Print all solutions
        int count = 1; // Counter for solution numbers
        for (List<String> solution : solutions) {
            System.out.println("Solution " + count + ":");
            for (String row : solution) {
                System.out.println(row);  // Print each row of the current solution
            }
            System.out.println();  // Print a blank line to separate different solutions
            count++; // Increment the solution counter
        }

        // Print the total number of solutions
        System.out.println("Total number of solutions: " + nQueen.boardCount);
    }
}

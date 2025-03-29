/**
 * Description
 * Date: 2025-01-8
 * @author Alex Reydman
 */
import hsa_new.Console;

public class TicTacToe {
    
    static Console c = new Console();  // Create Console object for text output
    
    // Method to display the game board
    public static void displayBoard(char[][] board) {
        c.clear();
        c.println("Tic Tac Toe");
        c.println("-------------");
        
        // Print the game board with better formatting
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c.print(board[i][j]);
                if (j < 2) c.print(" | ");
            }
            c.println();
            if (i < 2) c.println("-----------");
        }
        c.println("-------------");
    }

    // Method to check for a winner
    public static boolean checkWinner(char[][] board, char player) {
        // Check rows and columns in one loop
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||  // Row check
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {  // Column check
                return true;
            }
        }
        
        // Check diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
    
    // Method to check if the board is full (draw condition)
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to initialize the board with empty spaces
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Method to handle player input and validate it
    public static boolean getPlayerMove(char[][] board, char currentPlayer) {
        int row = -1, col = -1;
        
        while (true) {
            c.println("Player " + currentPlayer + ", enter your move (row [0-2] and column [0-2]): ");
            row = c.readInt();
            col = c.readInt();
            
            // Validate the move
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                return true;
            } else {
                c.println("Invalid move! Please try again.");
            }
        }
    }

    // Main method to play the game
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char currentPlayer = 'X';  // Player X starts
        
        initializeBoard(board);  // Initialize the board with empty spaces
        
        boolean gameOver = false;
        
        while (!gameOver) {
            displayBoard(board);
            
            // Get user input for the current player's move
            if (!getPlayerMove(board, currentPlayer)) {
                continue;  // If move is invalid, prompt again
            }
            
            // Check if the current player has won
            if (checkWinner(board, currentPlayer)) {
                displayBoard(board);
                c.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            }
            // Check for a draw (if the board is full)
            else if (isBoardFull(board)) {
                displayBoard(board);
                c.println("The game is a draw!");
                gameOver = true;
            }
            
            // Switch to the next player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}

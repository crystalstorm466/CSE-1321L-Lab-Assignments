package Assignment6;
import java.util.*;
public class Assignment6C {
    public static void main(String[] args) {
        String [] [] board = new String[4][4];
        boolean gameInProgress = true;
        Scanner scan = new Scanner(System.in);
       printBoard(board);
        int player = 1;
        while (gameInProgress) {
            if (player == 1) {
                boolean isFull = isBoardFull(board);
                addDisc(player, board);
                player++;
            } else if (player == 2) {
                addDisc(player, board);
                player--;;
            }
            printBoard(board);
        }
    }

    public static void addDisc(int player, String[][] board) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player " + player + ", enter a row: ");
        int placement = scan.nextInt();
            if (player == 1) {
                if (board[board.length - 1] [placement - 1] == " ") {
                    board[board.length - 1] [placement - 1] = "X";;
                }
            } else if (player == 2) {
                board[board.length - 1] [placement] = "O";
        }

    }

    public static void printBoard(String[][] board) {
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(board[i] [j] + "|");
            }
            System.out.println(" ");
        }
    }

    public static boolean isBoardFull(String[] [] board) {
        int counter = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!(board[i][j] == " " )) {
                    counter++;
                }
            }
        }
        if (counter >= 16) { // >= in case I calculated wrong
            return true;
        } else {
            return false;
        }
    }
}

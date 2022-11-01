package Assignment6;
import java.util.*;
public class Assignment6C {
    public static void main(String[] args) {
        String[][] board = new String[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = " ";
            }
        }
        boolean gameInProgress = true;
        Scanner scan = new Scanner(System.in);
        int player = 1;
        while (gameInProgress) {
            printBoard(board);
            if (player == 1) {
                addDisc(player, board);
                player++;
            } else if (player == 2) {
                addDisc(player, board);
                player--;
            }
            if (isBoardFull(board)) {
                System.out.println("Board is Full!");
                break;
            }
            if (winHorizontal(player, board)) {
                System.out.println("Player " + player + " wins!");
                break;
            } else if (winVertical(player, board)) {
                System.out.println("Player " + player + " wins!");
                break;
            } else if (winDiagonal(player, board)) {
                System.out.println("Player " + player + " wins!");
                break;
            }
        }
    }

    public static String[][] addDisc(int player, String[][] board) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player " + player + ", enter a row: ");
        int placement = scan.nextInt();
        for (int i = 3; i >= 0; i--) {
            if (board[i][placement - 1] == " ") {
                if (player == 1) {
                    board[i][placement - 1] = "X";
                    return board;
                } else if (player == 2) {
                    board[i][placement - 1] = "O";
                    return board;
                }
            }
        }
        return board;
    }

    public static boolean winVertical(int player, String[][] board) {
        int winCond = 0;
        String playerChar = null;
        if (player == 1) {
            playerChar = "X";
        } else if (player == 2) {
            playerChar = "O";
        }

        //iff statement to set char
        for (int i = 0; i <= 3; i++) {
            if (board[0][i] == playerChar && board[1][i] == playerChar && board[2][i] == playerChar && board[3][i] == playerChar) {
                return true;
            }
        }
        return false;
    }



    public static boolean winHorizontal(int player, String [] []board) {
        String playerChar = null;
        if (player == 1) {
            playerChar = "X";
        } else if (player == 2) {
            playerChar = "O";
        }
        //iff statement to set char
        for (int i = 0; i <= 3; i++) {

            if (board [i][0] == playerChar && board [i][1] == playerChar &&board [i][2] == playerChar &&board [i][3] == playerChar)
            {
                return true;
            }
        }

        return false;
    }

    //todo
    // if this isn't setup when I submit it just ignore it
    public static boolean winDiagonal(int player, String [] []board) {
        String playerChar = null;
        if (player == 1) {
            playerChar = "X";
        } else if (player == 2) {
            playerChar = "O";
        }
        //iff statement to set char

        return false;
    }
    public static String[][] printBoard(String[][] board) {
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(board[i] [j] + "|");
            }
            System.out.println(" ");
        }
        return board;
    }

    public static boolean isBoardFull(String[] [] board) {
        int counter = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((board[i][j] == " " )) {
                    return  false;
                }
            }
        }

            return true;
        }
    }


package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (isColumnAssembled(board, i) || isLineAssembled(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isLineAssembled(int[][] board, int row) {
        boolean result = true;
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] == 0) {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean isColumnAssembled(int[][] board, int column) {
        boolean result = true;
            for (int row = 0; row < board.length; row++) {
                if (board[row][column] == 0) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}

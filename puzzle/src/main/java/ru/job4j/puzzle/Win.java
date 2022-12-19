package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return (isColumnAssembled(board) || isLineAssembled(board));
    }

    public static boolean isLineAssembled(int[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == 0) {
                    result = false;
                    break;
                }
                if (board[row][board.length - 1] == 1) {
                    result = true;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    public static boolean isColumnAssembled(int[][] board) {
        boolean result = false;
        for (int cell = 0; cell < board.length; cell++) {
            for (int row = 0; row < board.length; row++) {
                if (board[row][cell] == 0) {
                    result = false;
                    break;
                }
                if (board[board.length - 1][cell] == 1) {
                    result = true;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}

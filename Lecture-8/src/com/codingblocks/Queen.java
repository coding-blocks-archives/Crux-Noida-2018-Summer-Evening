package com.codingblocks;

public class Queen {

    public static void main(String[] args) {

        int n = 4;
        boolean[][] board = new boolean[n][n];
        nqueens(board, 0);
    }



    public static void nqueens(boolean[][] board, int row){
        if (row == board.length){
            System.out.println("Solution found");
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = true;
                nqueens(board, row + 1);
                board[row][col] = false;
            }
        }

    }

    public static boolean isSafe(boolean[][] board, int row, int col) {


        // vertically up
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }


        // diagonal left up
        int left = Math.min(row, col);
        for (int i = 1; i <= left; i++) {
            if (board[row - i][col - i]){
                return false;
            }
        }

        // diagonal right up
        int right = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= right; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

        return true;

    }
}

package com.codingblocks;

public class Queen {

    public static void main(String[] args) {

        int n = 4;
        boolean[][] board = new boolean[n][n];
        nqueens(board, 0);
    }



    public static void nqueens(boolean[][] board, int row){
        if (row == board.length){
            printBoard(board);
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

    private static void printBoard(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]){
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }

        System.out.println();
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

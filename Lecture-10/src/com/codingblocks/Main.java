package com.codingblocks;

public class Main {

    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        boolean[][] maze = new boolean[rows][cols];

        maze[0][0] = true;

        mazePath("", 0, 0, maze);
    }

    public static void mazePath(String path, int row, int col, boolean[][] maze) {

        if (row == maze.length - 1 &&
                col == maze[0].length - 1){
            System.out.println(path);
            return;
        }

        if ( row > 0 && !maze[row - 1][col]){
            maze[row - 1][col] = true;
            mazePath(path + "U", row - 1, col, maze);
            maze[row - 1][col] = false;
        }


        if ( col > 0 && !maze[row][col - 1]){
            maze[row][col - 1] = true;
            mazePath(path + "L", row, col - 1, maze);
            maze[row][col - 1] = false;
        }


        if ( row < maze.length - 1 && !maze[row + 1][col]){
            maze[row + 1][col] = true;
            mazePath(path + "D", row + 1, col, maze);
            maze[row + 1][col] = false;
        }


        if ( col < maze[0].length - 1 && !maze[row][col + 1]){
            maze[row][col + 1] = true;
            mazePath(path + "R", row, col + 1, maze);
            maze[row][col + 1] = false;
        }
    }
}

package edu.sdccd.cisc191.c.server;;

public class TwoDArrayMenu {
    private int[][] array;

    public TwoDArrayMenu(int rows, int cols) {
        array = new int[rows][cols];
    }

    public int getAtIndex(int row, int col) {
        return array[row][col];
    }

    public void setAtIndex(int row, int col, int value) {
        array[row][col] = value;
    }

    public int findIndexOf(int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == value) {
                    return i * array[i].length + j; // Flattened index
                }
            }
        }
        return -1; // Not found
    }

    public void printAll() {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public void deleteAtIndex(int row, int col) {
        array[row][col] = 0; // Assuming 0 is the default "empty" value
    }

    public void expand(int newRows, int newCols) {
        int[][] newArray = new int[newRows][newCols];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, newArray[i], 0, array[i].length);
        }
        array = newArray;
    }

    public void shrink(int newRows, int newCols) {
        int[][] newArray = new int[newRows][newCols];
        for (int i = 0; i < newRows; i++) {
            System.arraycopy(array[i], 0, newArray[i], 0, newCols);
        }
        array = newArray;
    }
}

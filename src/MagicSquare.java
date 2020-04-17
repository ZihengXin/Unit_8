/**
 * This class check if the assigned square is a "magic square"
 * which the row, column, and diagonal has the same value.
 * @author Charly Xin
 * @since April 8, 2020
 */
public class MagicSquare {
    private int[][] grid;
    /**
     * Initiate MagicSquare object
     * @param g grid, which is a two dimensional array. It should be a square.
     */
    public MagicSquare(int[][] g) {
        grid = g;
    }
    /**
     * Finds the sum in the row
     * @param row the row that is assigned to find sum
     * @return sum of all numbers in the row
     */
    public int rowSum(int row) {
        int sum = 0;
        for(int i = 0; i<grid[row].length; i++){
            sum += grid[row][i];
        }
        return sum;
    }
    /**
     * Finds the sum in the column
     * @param col the column that is assigned to find sum
     * @return sum of all numbers in the column
     */
    public int colSum(int col) {
        int sum = 0;
        for(int row = 0; row<grid.length; row++){
            sum += grid[row][col];
        }
        return sum;
    }
    /**
     * Finds the sum in the upDiagonal(left down to up right)
     * @return sum of all numbers in the upDiagonal
     */
    public int upDiagSum() {
        int sum = 0;
        for (int i = grid.length-1; i > -1; i--) {
            sum += grid[i][grid.length-1-i];
        }
        return sum;
    }/**
     * Finds the sum in the downDiagonal(left up to up doown)
     * @return sum of all numbers in the downDiagonal
     */
    public int downDiagSum() {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += grid[i][i]; }
        return sum;
    }
    /**
     * Checks if the given grid is a magic square
     * @return whether the sum of  row, column, and diagonal is the same value
     */
    public boolean isMagicSquare() {
        boolean result = false;
        int row = 0;
        int col = 0;
        for(int i = 0; i < grid.length; i++){
            row += rowSum(i);
            col += colSum(i);
        }
        row /= grid.length;
        col /= grid.length;
        if (row == col && col == downDiagSum() && downDiagSum() == upDiagSum()){
            result = true;}
        return result;
    }
    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}


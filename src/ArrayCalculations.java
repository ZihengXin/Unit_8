public class ArrayCalculations {
    public static int columnSum(int[][] arr, int col) {
        // create a variable to keep track of the total
        int total = 0;

        // check to see if the given col variable is valid.
        // If col is less than 0 or is greater than
        // the number of columns (the length of one array) it is not valid.
        // Return -1 if not valid.
        if (col<0||col>arr.length-1){
            total = -1;
        }else{
            for(int i=0; i<=arr[col].length;i++){
                total += arr[i][col];
            }
        }
        // if col is valid, create a loop to calculate the sum. hint:
        // elements in a 2D array are found like
        // this arr[row][column]. If you are finding the sum of a col,
        // the [column] number will not change
        // only the [row] part will.
        return total;
        // return the total

    }

}

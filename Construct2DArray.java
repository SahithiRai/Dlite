import java.util.Arrays;

public class Construct2DArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = construct2DArray(original, m, n);
        
        if (result != null) {
            for (int[] row : result) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("Empty 2D array");
        }
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int totalElements = original.length;
        
        // Check if it is possible to create a 2D array with given m and n
        if (m * n != totalElements) {
            return new int[0][0]; // Empty 2D array
        }
        
        int[][] result = new int[m][n];
        int index = 0;
        
        // Fill the 2D array with elements from the original array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }
        
        return result;
    }
}


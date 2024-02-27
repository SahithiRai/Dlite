import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for matrix A:");
        int rowsA = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix A:");
        int colsA = scanner.nextInt();

        System.out.println("Enter the number of rows for matrix B:");
        int rowsB = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix B:");
        int colsB = scanner.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] matrixA = new int[rowsA][colsA];
            int[][] matrixB = new int[rowsB][colsB];

            System.out.println("Enter elements for matrix A:");
            inputMatrixElements(scanner, matrixA);

            System.out.println("Enter elements for matrix B:");
            inputMatrixElements(scanner, matrixB);

            int[][] product = multiplyMatrices(matrixA, matrixB);
            System.out.println("Product matrix:");
            printMatrix(product);
        }

        scanner.close();
    }

    public static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] product = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

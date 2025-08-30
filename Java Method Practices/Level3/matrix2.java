import java.util.Random;

public class matrix2 {

    public static int[][] createRandomMatrix(int size) {
        Random rand = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(10); 
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant(int[][] matrix) {
        int n = matrix.length;
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else if (n == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                 - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                 + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        throw new IllegalArgumentException("Determinant only implemented for 2x2 or 3x3 matrices.");
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant(matrix);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular, no inverse exists.");
        }
        double[][] inv = new double[2][2];
        inv[0][0] = matrix[1][1] / (double) det;
        inv[0][1] = -matrix[0][1] / (double) det;
        inv[1][0] = -matrix[1][0] / (double) det;
        inv[1][1] = matrix[0][0] / (double) det;
        return inv;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix(2);

        System.out.println("Matrix:");
        printMatrix(matrix);

        System.out.println("Transpose:");
        printMatrix(transpose(matrix));

        int det = determinant(matrix);
        System.out.println("Determinant = " + det);

        if (matrix.length == 2) {
            try {
                System.out.println("Inverse:");
                printMatrix(inverse2x2(matrix));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

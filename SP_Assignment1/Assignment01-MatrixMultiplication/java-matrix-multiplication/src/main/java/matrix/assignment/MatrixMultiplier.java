package matrix.assignment;

public class MatrixMultiplier {

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {

        if (matrix1.length == 0 || matrix2.length == 0) {
            throw new IllegalArgumentException("Matrices cannot be empty.");
        }
        
        int matrix1RowCount = matrix1.length;
        int matrix1ColCount = matrix1[0].length;
        int matrix2RowCount = matrix2.length;
        int matrix2ColCount = matrix2[0].length;

        if (matrix1ColCount != matrix2RowCount) {
            throw new IllegalArgumentException("Invalid matrix dimensions for multiplication.");
        }

        int[][] resultMatrix = new int[matrix1RowCount][matrix2ColCount];

        for (int i = 0; i < matrix1RowCount; i++) {
            for (int j = 0; j < matrix2ColCount; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < matrix1ColCount; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }
}

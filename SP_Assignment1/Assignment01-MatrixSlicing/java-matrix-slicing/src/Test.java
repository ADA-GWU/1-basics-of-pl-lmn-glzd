package SoftwareParadigms;

public class Test {
	public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {20, 30, 40, 50, 60}
        };

        int rowStart = 1; 
        int rowEnd = 2;   
        int colStart = 2; 
        int colEnd = 4;   
        
        MatrixSlicer.displayMatrix(matrix, rowStart, rowEnd, colStart, colEnd);

        MatrixSlicer.printMatrix(MatrixSlicer.sliceMatrix(matrix, rowStart, rowEnd, colStart, colEnd));
        
      
    }
	
}

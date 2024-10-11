package SoftwareParadigms;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int rowCount, colCount;

	        System.out.println("Please enter the number of rows and columns for the 2D matrix:");
	        rowCount = scanner.nextInt();
	        colCount = scanner.nextInt();

	        int[][] array = new int[rowCount][colCount];

	        System.out.println("Enter the 2D matrix below:");
	        for (int i = 0; i < rowCount; i++) {
	            for (int j = 0; j < colCount; j++) {
	                array[i][j] = scanner.nextInt();
	            }
	        }

	        int rowStart, colStart, rowEnd, colEnd;

	        System.out.println("Enter index values for slicing matrix (0-indexed):\n");

	        while (true) {
	            System.out.println("Start and end index for rows:");
	            rowStart = scanner.nextInt();
	            rowEnd = scanner.nextInt();

	            if (rowEnd >= rowCount || rowStart < 0) {
	                System.out.println("Please enter valid row indices for slicing.");
	                continue;
	            }

	            System.out.println("Enter start and end index for columns:");
	            colStart = scanner.nextInt();
	            colEnd = scanner.nextInt();

	            if (colEnd >= colCount || colStart < 0) {
	                System.out.println("Please enter valid column indices for slicing.");
	                continue;
	            }
	            break;
	        }

	        System.out.println("Resulting matrix is:");
	        MatrixSlicer.printMatrix(MatrixSlicer.sliceMatrix(array, rowStart, rowEnd, colStart, colEnd));
	        MatrixSlicer.displayMatrix(array, rowStart, rowEnd, colStart, colEnd);

	        
	    }
}

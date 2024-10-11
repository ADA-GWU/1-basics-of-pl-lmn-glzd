package matrix.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	

    public static void printMatrix(int[][] matrix) {
       for (int i = 0; i < matrix.length; i++) {
       System.out.println(Arrays.toString(matrix[i]));
    }
}

	public static void main(String args[]) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n, m, l, k;

			while(true) {
				System.out.println("Enter the dimensions of first matrix: ");
				n = scanner.nextInt();
				m = scanner.nextInt();

				System.out.println("Enter the dimensions of second matrix: ");
				l = scanner.nextInt();
				k = scanner.nextInt();

				if(m != l) {
					System.out.println("Oops. These matrices cannot be multiplied due to incompatible dimensions. Please re-enter the dimensions.");
				} else {
					break;
				}
			}

			int arr1[][] = new int[n][m];
			int arr2[][] = new int[l][k];

			System.out.printf("Enter the first matrix with %d x %d size:\n", n, m);
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					arr1[i][j] = scanner.nextInt();
				}
			}

			System.out.printf("Enter the second matrix with %d x %d size:\n", l, k);
			for(int i = 0; i < l; i++) {
				for(int j = 0; j < k; j++) {
					arr2[i][j] = scanner.nextInt();
				}
			}

			System.out.printf("\nResulting %d x %d matrix is:\n", n, k);

			printMatrix(MatrixMultiplier.multiplyMatrices(arr1, arr2));
		}
		
	}
}

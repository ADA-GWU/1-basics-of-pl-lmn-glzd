package matrix.assignment;


	import static org.junit.Assert.assertArrayEquals;
	import org.junit.Test;

import matrix.assignment.MatrixMultiplier;

	public class MatrixMultiplicationTest {

	    @Test
	    public void testValidMultiplication() {
	        int[][] a = { {1, 2}, {3, 4} };
	        int[][] b = { {5, 6}, {7, 8} };
	        int[][] expected = { {19, 22}, {43, 50} };
	        
	        assertArrayEquals(expected, MatrixMultiplier.multiplyMatrices(a, b));
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testInvalidMultiplication() {
	        int[][] a = { {1, 2}, {3, 4} };
	        int[][] b = { {5, 6} }; 
	        
	        MatrixMultiplier.multiplyMatrices(a, b); 
	    }

	    @Test
	    public void testMultiplicationWithZeroMatrix() {
	        int[][] a = { {1, 2}, {3, 4} };
	        int[][] b = { {0, 0}, {0, 0} };
	        int[][] expected = { {0, 0}, {0, 0} };
	        
	        assertArrayEquals(expected, MatrixMultiplier.multiplyMatrices(a, b));
	    }

	    @Test
	    public void testMultiplicationWithIdentityMatrix() {
	        int[][] a = { {1, 2}, {3, 4} };
	        int[][] b = { {1, 0}, {0, 1} }; 
	        int[][] expected = { {1, 2}, {3, 4} };
	        
	        assertArrayEquals(expected, MatrixMultiplier.multiplyMatrices(a, b));
	    }

	    @Test
	    public void testLargeMatrixMultiplication() {
	        int[][] a = { {1, 2, 3}, {4, 5, 6} };
	        int[][] b = { {7, 8}, {9, 10}, {11, 12} };
	        int[][] expected = { {58, 64}, {139, 154} };
	        
	        assertArrayEquals(expected, MatrixMultiplier.multiplyMatrices(a, b));
	    }
	}



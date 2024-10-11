package SoftwareParadigms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MatrixSlicer {

    public static int[][] sliceMatrix(int[][] array, int rowStart, int rowEnd, int colStart, int colEnd) {
        int rowCount = rowEnd - rowStart + 1;
        int colCount = colEnd - colStart + 1;
        int[][] result = new int[rowCount][colCount];

        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                result[i - rowStart][j - colStart] = array[i][j];
            }
        }

        return result;
    }
 

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
        System.out.println(Arrays.toString(matrix[i]));
     }
 }
    
    public static void displayMatrix(int[][] matrix, int rowStart, int rowEnd, int colStart, int colEnd) {
        JFrame frame = new JFrame("Sliced Matrix");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(matrix.length, matrix[0].length));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                JLabel label = new JLabel(String.valueOf(matrix[i][j]), SwingConstants.CENTER);
                
                if (i >= rowStart && i <= rowEnd && j >= colStart && j <= colEnd) {
                    label.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
                    label.setBackground(Color.YELLOW); 
                    label.setOpaque(true); 
                }
                
                label.setPreferredSize(new Dimension(50, 30)); 
                frame.add(label);
            }
        }

        frame.pack(); 
        frame.setVisible(true);
    }


   
}

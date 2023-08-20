package ClosedlabBook;

public class NumberMatrixx {

	    public static void main(String[] args) {
	        int rows = 4;
	        int[][] matrix = new int[rows][];
	        
	        int num = 1;
	        
	        // Populate the matrix and determine the size of each row
	        for (int i = 0; i < rows; i++) {
	            matrix[i] = new int[i + 1]; // Each row has i + 1 columns
	            for (int j = 0; j < i + 1; j++) {
	                matrix[i][j] = num;
	                num++;
	            }
	        }
	        
	        // Display the matrix
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}




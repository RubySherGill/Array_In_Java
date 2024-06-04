package com.tka.two_d_array;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the dimensions of the matrices
	        System.out.print("Enter the number of rows for the first matrix: ");
	        int rows1 = scanner.nextInt();
	        System.out.print("Enter the number of columns for the first matrix: ");
	        int cols1 = scanner.nextInt();
	        System.out.print("Enter the number of rows for the second matrix: ");
	        int rows2 = scanner.nextInt();
	        System.out.print("Enter the number of columns for the second matrix: ");
	        int cols2 = scanner.nextInt();

	        // Check if the matrices can be multiplied
	        if (cols1 != rows2) {
	            System.out.println("Matrices cannot be multiplied! Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
	            return;
	        }

	        // Create arrays for the two matrices and the result matrix
	        int[][] matrix1 = new int[rows1][cols1];
	        int[][] matrix2 = new int[rows2][cols2];
	        int[][] resultMatrix = new int[rows1][cols2];

	        // Prompt the user to enter elements for the first matrix
	        System.out.println("Enter elements for the first matrix:");
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols1; j++) {
	                System.out.print("Enter element [" + i + "][" + j + "]: ");
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }

	        // Prompt the user to enter elements for the second matrix
	        System.out.println("Enter elements for the second matrix:");
	        for (int i = 0; i < rows2; i++) {
	            for (int j = 0; j < cols2; j++) {
	                System.out.print("Enter element [" + i + "][" + j + "]: ");
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }

	        // Perform matrix multiplication
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                for (int k = 0; k < cols1; k++) {
	                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }

	        // Print the result matrix (matrix multiplication)
	        System.out.println("Result of Matrix Multiplication:");
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	}

}

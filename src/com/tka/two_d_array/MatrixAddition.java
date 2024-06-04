package com.tka.two_d_array;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter col");
		int cols = sc.nextInt();
		
		int m[][] = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter value for "+i+" "+j);
				int val1= sc.nextInt();
				m[i][j]=val1;
				
			}
		}
		System.out.println("*******  Matrix 1 *********");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		int r[][] = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter value for "+i+" "+j);
				int val2= sc.nextInt();
				r[i][j]=val2;
				
			}
		}
		System.out.println("*******  Matrix 2 *********");

		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(r[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("----------Matrix Addition-----------");
		int mr[][] = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				mr[i][j] = m[i][j]+r[i][j];
				System.out.print(mr[i][j] +"\t");
			}
			System.out.println();
		}
		
		
	}

}

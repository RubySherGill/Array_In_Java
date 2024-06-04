package com.tka.two_d_array;

import java.util.Scanner;

public class SubArrayMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter no. of cols");
		int cols = scanner.nextInt();
		if(rows<=0 || cols<=0) {
			System.out.println("Invaild rows n columns");
			System.exit(0);
		}
		
		int m[][] = new int[rows][cols];
		int r[][] = new int[rows][cols];
		int mr[][] = new int[rows][cols];
		
		System.out.println("--------- Matrix A ---------");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				m[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("--------- Matrix B ---------");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				r[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("---------- Matrix Substraction ----------");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i == j) {
					mr[i][j]=m[i][j]+r[i][j];
					System.out.print(mr[i][j] + "\t");
				}
				else{
					mr[i][j]=m[i][j]+r[i][j];
					System.out.print(mr[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
		
	}

}

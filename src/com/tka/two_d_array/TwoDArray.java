package com.tka.two_d_array;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows =sc.nextInt();
		System.out.println("Enter number of columns");
		int cols= sc.nextInt();
		if(rows<=0 || cols<=0) {
			System.out.println("Invalid rows n columns");
			System.exit(0);
			
		}
		
		int m[][] = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter value for " + i + " " + j);
				int value = sc.nextInt();
				m[i][j] = value;
			}
		}

		System.out.println("--------Matrices Display----------");

//		m[0][0] = 11;
//		m[0][1] = 5;
//		m[0][2] = 7;
//
//		m[1][0] = 20;
//		m[1][1] = 37;
//		m[1][2] = 16;
//
//		m[2][0] = 23;
//		m[2][1] = 5;
//		m[2][2] = 3;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(m[i][j] + " \t");
			}
			System.out.println();
		}

	}

}

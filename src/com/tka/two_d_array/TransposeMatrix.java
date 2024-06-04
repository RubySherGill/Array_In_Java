package com.tka.two_d_array;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
		int rows = sc.nextInt();
		System.out.println("Enter Columns ");
		int cols = sc.nextInt();

		int mr[][] = new int[rows][cols];
		System.out.println("Enter matrix elements");
		for (int i = 0; i < mr.length; i++) {
			for (int j = 0; j < mr.length; j++) {
				mr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Display Matrix");
		for (int i = 0; i < mr.length; i++) {
			for (int j = 0; j < mr.length; j++) {
				System.out.print(mr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Transpose Matrix");
		for (int i = 0; i < mr.length; i++) {
			for (int j = 0; j < mr.length; j++) {
				System.out.print(mr[j][i] + " ");
			}
			System.out.println();
		}

	}

}

package com.tka.two_d_array;

import java.util.Scanner;

public class UpperTriangularMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter cols");
		int cols = sc.nextInt();

		System.out.println("Enter array elements");
		int mr[][] = new int[rows][cols];
		for (int i = 0; i < mr.length; i++) {
			for (int j = 0; j < mr.length; j++) {
				mr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Lower triangular Matrix");
		for (int i = 0; i < mr.length; i++) {
			for (int j = 0; j < mr.length; j++) {
				if (i <= j) {
					System.out.print(mr[i][j] + " ");
				} else {
					System.out.print("0" + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Upper triangular Matrix");
		for (int i = 0; i < mr.length; i++) {
			for (int j = 0; j < mr.length; j++) {
				if (i >= j) {
					System.out.print(mr[i][j] + " ");
				} else {
					System.out.print("0" + " ");
				}
			}
			System.out.println();
		}
	}

}

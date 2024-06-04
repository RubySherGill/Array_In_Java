package com.tka.arrays;

import java.util.Scanner;

public class DuplicateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		int m[] = new int[size];
		int i, j;
		int found = 0;
		int duplicateCount=0;

		System.out.println("Enter  elements of an Array");
		for (i = 0; i < size; i++) {
			m[i] = sc.nextInt();
		}

		
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (m[i] == m[j]) {
					System.out.print(m[j]+" ");
					found = 1;
					duplicateCount++;
				}
			}
		}
		if (found == 1) {
			System.out.println("\nduplicates elements are found");
			System.out.println("Count of duplicates elements : "+duplicateCount);
		} 
		else {
			System.out.println("duplicates elements are not found");
		}

	}

}

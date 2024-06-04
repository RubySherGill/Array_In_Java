package com.tka.arrays;

import java.util.Scanner;

public class StudentMarksArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		float avg = 0;
		System.out.println("Enter total subject");
		int num = sc.nextInt();
		int marks[] = new int[num];
		System.out.println("Enter marks");
		for (int i = 0; i < num; i++) {
			int values = sc.nextInt();
			marks[i] = values;
		}

		System.out.println("Display marks");
		for (int i = 0; i < num; i++) {
			System.out.print(marks[i]+" ");
		}

		System.out.println();
		System.out.println("\nTotal Sum of Marks");
		for (int i = 0; i < num; i++) {
			sum = sum + marks[i];
		}
		System.out.println("Sum : " + sum);

		System.out.println();
		System.out.println("Average grade of marks");
		avg = sum / num;
		System.out.println("Average : " + avg);

		System.out.println();
		int max = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (max < marks[i]) {
				max = marks[i];
			}
		}
		System.out.println("Max marks is : " + max);

		System.out.println();
		int min = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (min > marks[i]) {
				min = marks[i];
			}
		}
		System.out.println("Min marks is : " + min);

		System.out.println();
		int evensum = 0;
		int evencount = 0;
		System.out.println("Even Marks is :");
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] % 2 == 0) {
				System.out.print(marks[i]+" ");
				evensum = evensum+marks[i];
				evencount++;
			}
		}
		System.out.println("\nSum of even Marks :"+evensum);
		System.out.println("Even count is :"+evencount);
		
		System.out.println();
		System.out.println("Odd Marks is :");
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] % 2 != 0) {
				System.out.print(marks[i]+" ");
			}
		}
		System.out.println("\nSum of odd Marks :"+evensum);
		System.out.println("Odd count is :"+evencount);
	}

}

package com.tka.arrays;

import java.util.Scanner;

public class SumofEvenOddArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array");
		int num = sc.nextInt();
		int m[] = new int[num];
		System.out.println("Enter elements of an array");
		for (int i = 0; i < num; i++) {
			m[i] = sc.nextInt();
		}

		System.out.println("Display Array");
		for (int i = 0; i < num; i++) {
			System.out.print(m[i] + "  ");
		}

		System.out.println();
		int evencount = 0, oddcount = 0;
		int positivenum = 0, zeros = 0;
		int esum = 0, osum = 0;
		for (int i = 0; i < num; i++) {
			if (m[i] % 2 == 0) {
				esum = esum + m[i];
				evencount++;
			} else {
				osum = osum + m[i];
				oddcount++;
			}

			if (m[i] > 0) {
				positivenum++;
			}

			if (m[i] == 0) {
				zeros++;
			}
		}
		System.out.println("Sum of Even number of Array is : " + esum);
		System.out.println("EvenCount is :" + evencount);
		System.out.println("Sum of Odd number of Array is : " + osum);
		System.out.println("OddCount is :" + oddcount);
		System.out.println("Postive number Count is :" + positivenum);
		System.out.println("Zeros number Count is :" + zeros);

		/*
		 * System.out.println(); int oddcount= 0; for(int i=0 ; i<=4; i++) if(m[i] %2 !=
		 * 0) { sum = sum+m[i]; oddcount++; }
		 * System.out.println("Sum of Odd number of Array is : " + sum);
		 * System.out.println("OddCount is :"+oddcount);
		 */
	}

}

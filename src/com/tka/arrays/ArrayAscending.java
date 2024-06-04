package com.tka.arrays;

import java.util.Scanner;

public class ArrayAscending {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements of Array");
		int i ,j,temp;
		for(i=0;i<=4;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<=4;i++) {
			for(j=i+1;j<=4;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for(i=0;i<=4;i++)
		{
		System.out.print( "\t"+a[i]);
		}
	
		//////////////// Descending Order ////////////
		System.out.println();
		for(i=0;i<=4;i++) {
			for(j=i+1;j<=4;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Decending Order");
		for(i=0;i<=4;i++)
		{
		System.out.print( "\t"+a[i]);
		}
	}

}

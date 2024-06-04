package com.tka.arrays;

public class ArrayDeclaration {
	public static void main(String[] args) {
		// int a[]; //1 way
		// int [] b; //2 way

		// sum = a[0]+a[1]+a[2]+a[3]+a[4];
		// int sum=0;

		// copy Array elements from one array to another
//		int[] a= {1,2,3,4,5};
//		int b[] = new int[a.length];
//		for(int i=0;i<a.length;i++) {
//			b[i] = a[i];
//			//System.out.println(b[i]);  
//		}
//		System.out.println("Display b Array");
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]+" ");
//		}

		// print sum of Array
//		for(int i=0;i<a.length;i++) {
//			sum = sum+a[i];
//		}
//		System.out.println(sum);

		// Display Array in Reverse Order
//		System.out.println("Array in Reverse Order");
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.println(a[i]);
//		}

		// Merging of 2 Array
//		int m[] = { 1, 2, 3, 4, 5 };
//		int r[] = { 11, 22, 33, 44, 55 };
//		int mr[] = new int[m.length + r.length];
//		for (int i = 0; i < m.length; i++) {
//			mr[i] = m[i];
//			System.out.print(mr[i]+" ");
//		}
//
//		for (int i = 0; i < r.length; i++) {
//			mr[i] = r[i];
//			System.out.print(mr[i]+" ");
//		}

		// Find maximum element from Array
//		int m[] = {11,5,8,4,3,16};
//		int max =m[0];
//		for(int i=0;i<m.length;i++) {
//			if(max < m[i]) {
//				max = m[i];
//			}
//		}
//		System.out.println("Max element is :"+max);

		// Find minimum element of Array
		int r[] = { 11, 5, 7, 16, 3 };
		int min = r[0];
		for (int i = 0; i < r.length; i++) {
			if (min > r[i]) {
				min = r[i];
			}
		}
		System.out.println("Min element is :" + min);

		System.out.println("--------------------------------");

		int rm[] = new int[5];
		rm[0] = 11;
		rm[1] = 5;
		rm[2] = 7;
		rm[3] = 16;
		rm[4] = 3;
		int minval = rm[0];
		for (int i = 0; i < 5; i++) {
			if (minval > rm[i]) {
				minval = rm[i];
			}
		}
		System.out.println("min element is :" + minval);

	}

}

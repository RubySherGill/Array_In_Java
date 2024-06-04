package com.tka.arrays;

import java.util.Scanner;

public class SearchingArray {
	public static void main(String[] args) {
		int m[] = new int[5];
		int key;
		int found=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements of Array");
		for(int i=0 ; i<=4 ; i++) {
			m[i] = sc.nextInt();
		}
		System.out.println("Enter your searching key element : ");
		key = sc.nextInt();
		
		for(int i=0;i<=4;i++) {
			if(key == m[i]) {
				found = 1;
				break;
			}
		}
		
		if(found==1) {
			System.out.println("Element is found");
		}
		else {
			System.out.println("Element is not found");
		}
		
		
	}

}

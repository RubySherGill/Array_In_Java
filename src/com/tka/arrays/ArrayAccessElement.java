package com.tka.arrays;

public class ArrayAccessElement {
	public static void main(String[] args) {
		int b[]= new int[5];   //Array initilization with declaration
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		//b[5] = 60;
		System.out.println("Accessed Elements");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		//System.out.println(b[5]);
		//ArrayIndexOutOfBoundException
		System.out.println("-------------------------------");
		System.out.println("Using for loop");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}

}

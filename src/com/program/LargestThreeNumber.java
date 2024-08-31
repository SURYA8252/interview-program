package com.program;

public class LargestThreeNumber {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		if(a > b && a > c) {
			System.out.println("A is greather.");
		} else if(b > a && b > c) {
			System.out.println("B is greather.");
		} else {
			System.out.println("C is greather.");
		}
	}
}

package com.program;

public class FindEvenOddNumberArray {
	public static void main(String[] args) {
		int arr[] = {3, 5, 10, 2, 20,9};
		for(int number : arr) {
			if(number % 2 == 0) {
				System.out.println("Even : " + number);
			} else {
				System.out.println("Odd : " + number);
			}
		}
	}
}

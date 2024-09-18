package com.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumberList {
	
	public static void main(String[] args) {
		List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 39);
		Integer result = listOfInteger.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(result);
	}
}

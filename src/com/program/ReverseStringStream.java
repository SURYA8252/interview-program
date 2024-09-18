package com.program;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringStream {

	public static void main(String[] args) {
		String str = "Java";
		String revString = myRevString(str);
		System.out.println(revString);
	}
	private static String myRevString(String str) {
		String collect = Stream.of(str).map(string -> new StringBuffer(str).reverse()).collect(Collectors.joining(str));
		return collect;
	}
}

package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstCharacterUsingStream {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("rohit","surya","amit");
		List<String> collect = names.stream().filter(name -> name.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);
	}
}

package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyStringList {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "def", "efg", "", "xyz", "", "abcd");
		List<String> collect = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
		System.out.println(collect);
	}
}

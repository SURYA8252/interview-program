package com.program;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 6, 5, 2};

        int largest = numbers[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}


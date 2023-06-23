package com.java.Baekjoon;

import java.util.Scanner;

public class Beak11720_SumOfNumber {
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		String numbers;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();scan.nextLine();
		numbers=scan.nextLine();

		for (int i = 0; i < n; i++) {
			sum+=Character.getNumericValue(numbers.charAt(i));
		}
		
		System.out.println(sum);
	}
}

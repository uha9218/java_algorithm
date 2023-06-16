package com.java.Inflearn;

import java.util.Scanner;

public class String1_FindChar {
	public static int solution(String input1, char input2) {
		int result = 0;

		for (int i = 0; i < input1.length(); i++) {
			if (String.valueOf(input2).equalsIgnoreCase(input1.substring(i, i + 1))) {
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String input1 = in.nextLine();
		char input2 = in.next().charAt(0);
		int result = solution(input1, input2);

		System.out.println(result);
	}

}

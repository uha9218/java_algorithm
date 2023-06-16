package com.java.Inflearn;

import java.util.Scanner;

public class String5_FlipSpecificChar {
	public static String FlipWord(String str) {
		// 선언
		int length = str.length();
		char[] input = new char[length];
		char[] temp = new char[length];
		String result;

		// 처리
		for (int i = 0; i < length; i++) {
			input[i] = str.charAt(i);
		}
		for (int i = 0; i < length; i++) {
			temp[i] = input[length - 1 - i];
		}
		result = String.valueOf(temp);

		return result;
	}

	public static String solution(String str) {

		// 선언
		char[] input = new char[str.length()];
		int[] alphaLocation;
		char[] alpha;
		String temp;
		int alphaNum = 0;
		char[] result = new char[str.length()];

		// 입력
		for (int i = 0; i < str.length(); i++) {
			input[i] = str.charAt(i);
			if ((input[i] >= 65 && input[i] <= 90) || (input[i] >= 97 && input[i] <= 122)) {
				alphaNum++;
			}
		}

		alphaLocation = new int[alphaNum];
		alpha = new char[alphaNum];

		alphaNum = 0;
		// 처리
		for (int i = 0; i < str.length(); i++) {
			if ((input[i] >= 65 && input[i] <= 90) || (input[i] >= 97 && input[i] <= 122)) {
				alphaLocation[alphaNum] = i;
				alpha[alphaNum] = input[i];
				alphaNum++;
			}
		}

		temp = FlipWord(String.valueOf(alpha));

		for (int i = 0; i < temp.length(); i++) {
			alpha[i] = temp.charAt(i);
		}

		alphaNum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == alphaLocation[alphaNum]) {
				result[i] = alpha[alphaNum];
				alphaNum++;
			} else {
				result[i] = input[i];
			}
		}

		str = String.valueOf(result);

		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		String result;

		Scanner scan = new Scanner(System.in);

		// 입력
		input = scan.nextLine();
		result = solution(input);
		System.out.println(result);
	}

}

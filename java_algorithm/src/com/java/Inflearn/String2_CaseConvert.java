package com.java.Inflearn;

import java.util.Scanner;

public class String2_CaseConvert {
	public static void solution(String str) {
		char[] input = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			input[i] = str.charAt(i);
			if ((int) input[i] >= 65 && (int) input[i] <= 90) {
				input[i] = Character.toLowerCase(input[i]);
			} else if ((int) input[i] >= 97 && (int) input[i] <= 122) {
				input[i] = Character.toUpperCase(input[i]);
			}
			System.out.print(input[i]);
		}
	}
	
	public static String T_solution(String str) {
		String answer ="";
		
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer +=Character.toUpperCase(x);
			else answer +=Character.toLowerCase(x);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		solution(input);
		System.out.println(T_solution(input));

		return;
	}

}

package com.java.Inflearn;

import java.util.Scanner;

public class String3_WordInSentence {
	public String solution(String str) {

		String[] input = str.split(" ");
		int[] len = new int[input.length];
		int max = 0;
		int maxNum = 0;
		
		for (int i = 0; i < input.length; i++) {
			len[i] = input[i].length();
			if (len[i] > max) {
				max = len[i];
				maxNum = i;
			}
		}
		return input[maxNum];

	}

	public String T_solution(String str) {
		String answer ="";
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String3_WordInSentence s_3 = new String3_WordInSentence();
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		System.out.println(s_3.solution(input));

		return;
	}

}

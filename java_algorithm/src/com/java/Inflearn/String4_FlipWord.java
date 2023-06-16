package com.java.Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class String4_FlipWord {

	public String solution(String str) {
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
	
	/*StringBuilder
	 * 
	 * */
	public ArrayList<String> T_solution(int n, String[] str){ 
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String4_FlipWord s_4 = new String4_FlipWord();
		Scanner scan = new Scanner(System.in);

		// 선언
		int num = scan.nextInt();
		scan.nextLine();
		String[] input = new String[num];

		// 처리
		for (int i = 0; i < num; i++) {
			input[i] = scan.nextLine();
			input[i] = s_4.solution(input[i]);
		}

		// 출력
		for (int i = 0; i < num; i++) {
			System.out.println(input[i]);
		}
	}

}

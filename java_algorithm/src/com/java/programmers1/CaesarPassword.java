package com.java.programmers1;

public class CaesarPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "a A b B";
		int n = 25;
		char[] tmp = new char[input.length()];
		String answer = "";

		for (int i = 0; i < input.length(); i++) {

			tmp[i] = input.charAt(i); // 1. input -> tmp
			// 2. n만큼 밀음
			if (Character.isLowerCase(tmp[i])) { // 소문자
				tmp[i] = (char) (tmp[i] + n);
				System.out.println("1" + tmp[i]);
				if (tmp[i] > 122) { // z->a
					tmp[i] = (char) (97 + (tmp[i] - 123));
					System.out.println("2" + tmp[i]);
					continue;
				}
			} else if (Character.isUpperCase(tmp[i])) { // 대문자
				tmp[i] = (char) (tmp[i] + n);
				System.out.println("3" + tmp[i]);
				if (tmp[i] > 90) {// Z->A
					tmp[i] = (char) (65 + (tmp[i] - 91));
					System.out.println("4" + tmp[i]);
					continue;
				}
			}
		}

		// 3.tmp[i]->string
		for (int i = 0; i < tmp.length; i++) {
			answer += tmp[i];
		}

		System.out.println(answer);

	}

}

package com.java.programmers1;

public class TernaryFlip {

	public static int solution(int n) {
		int answer;
		String temp="";
		
		//1. 3�������� ��ȯ
		String str = Integer.toString(n,3);
		
		//2. String�� char�� �ɰ��� ������ �� �ٽ� String���� ��ȯ
		for(int i=0;i<str.length();i++) {
			temp += Character.toString(str.charAt(str.length()-i-1));
		}
		
		//3. 10�������� ��ȯ
		answer = Integer.parseInt(temp,3);
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = solution(45);
		System.out.println(answer);
	}

}

package com.java.programmers1;

public class TernaryFlip {

	public static int solution(int n) {
		int answer;
		String temp="";
		
		//1. 3진법으로 변환
		String str = Integer.toString(n,3);
		
		//2. String을 char로 쪼개고 뒤집은 후 다시 String으로 변환
		for(int i=0;i<str.length();i++) {
			temp += Character.toString(str.charAt(str.length()-i-1));
		}
		
		//3. 10진법으로 전환
		answer = Integer.parseInt(temp,3);
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = solution(45);
		System.out.println(answer);
	}

}

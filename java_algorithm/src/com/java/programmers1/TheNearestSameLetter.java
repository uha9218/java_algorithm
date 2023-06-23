package com.java.programmers1;

public class TheNearestSameLetter {

	public static void main(String[] args) {
		String s = "foobar";
		int[] answer = new int[s.length()];

		// 입력
		char[] tmp = s.toCharArray();
		answer[0] = -1;
		// 처리
		for (int i = 1; i < tmp.length; i++) {
			for (int j = i; j >= 0; j--) {
				if(i==j) continue;
				if(Character.compare(tmp[i], tmp[j])==0) {
					answer[i]=i-j;
					j=-1;
					continue;
					
				}else answer[i]=-1;
			}
		}
		for(int i=0;i<answer.length;i++)System.out.println(answer[i]);


	}

}

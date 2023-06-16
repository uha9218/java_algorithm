package com.java.programmers1;

public class HateTheSameNumber {

	public static int[] solution(int[] arr) {
		int[] stack = new int[arr.length];
		int[] result;
		int top=0;
		
		stack[0]=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(stack[top]!=arr[i]) {
				top++;
				stack[top]=arr[i];
			}
		}
		result = new int[(top+1)];
		for(int i=0;i<(top+1);i++) {
			result[i]=stack[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,3,3,0,1,1};
		int[] answer;
		
		answer = solution(arr);
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}

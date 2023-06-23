package com.java.programmers1;

import java.util.Stack;

public class FoddFighterContest {

	public static void main(String[] args) {
		
		int[] food = {1,3,4,6};
		String answer="";
		Stack<String> stack = new Stack<>();
		
		for(int i=1;i<food.length;i++) {
			for(int j=0;j<food[i]/2;j++) {
				String tmp=Integer.toString(i);
				stack.push(tmp);
				answer+=tmp;
			}
		}
		answer+="0";
		while(!stack.isEmpty()) {
			answer+=stack.pop();
		}
		
		System.out.println(answer);
	}

}

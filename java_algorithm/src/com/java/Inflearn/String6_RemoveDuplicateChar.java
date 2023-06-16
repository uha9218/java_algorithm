package com.java.Inflearn;

import java.util.ArrayList;
import java.util.List;

public class String6_RemoveDuplicateChar {

	public static void main(String[] args) {
		//선언
		List stack = new ArrayList();
		String str="ksekkset";
		
		
		//입력
		stack.add(str.charAt(0));
		//처리
		for(int i=0;i<str.length();i++) {
			if(!stack.contains(str.charAt(i))) {
				stack.add(str.charAt(i));
				
			}
		}
		
		//출력
		System.out.println(stack);
	}

}

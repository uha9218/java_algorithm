package com.java.Inflearn;

import java.util.ArrayList;
import java.util.List;

public class String6_RemoveDuplicateChar {

	public static void main(String[] args) {
		//����
		List stack = new ArrayList();
		String str="ksekkset";
		
		
		//�Է�
		stack.add(str.charAt(0));
		//ó��
		for(int i=0;i<str.length();i++) {
			if(!stack.contains(str.charAt(i))) {
				stack.add(str.charAt(i));
				
			}
		}
		
		//���
		System.out.println(stack);
	}

}

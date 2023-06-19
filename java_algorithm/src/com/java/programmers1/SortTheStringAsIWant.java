package com.java.programmers1;

import java.util.Arrays;

public class SortTheStringAsIWant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"abce", "abcd", "cdx"};
		int n=2;
		
		for(int i=0;i<strings.length;i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		
		Arrays.sort(strings);
		
		for(int i=0;i<strings.length;i++) {
			strings[i] = strings[i].substring(1);
			System.out.println(strings[i]);
		}
	}

}

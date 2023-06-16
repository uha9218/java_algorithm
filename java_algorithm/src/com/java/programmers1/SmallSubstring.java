package com.java.programmers1;

import java.util.ArrayList;
import java.util.List;

public class SmallSubstring {

	public static void main(String[] args) {
		String t = "2222200000";
		String p = "10";
		int result=0;
		List sub_t = new ArrayList();
		
		for(int i=0;i<(t.length()-p.length()+1);i++) {
			sub_t.add(t.substring(i, i+p.length()));
			if(Long.parseLong((String) sub_t.get(i))<=Long.parseLong(p)) result++;
		}
		
		System.out.println(result);
	}

}

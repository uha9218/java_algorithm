package com.java.programmers1;

import java.util.ArrayList;
import java.util.Collections;

public class Budget {
	
	public int solution(int budget, int[] arr){
		ArrayList<Integer> dep = new ArrayList<>();
		int result=0;
		boolean flag = true;
			
		for(int i=0;i<arr.length;i++) {dep.add(arr[i]);}
	
		Collections.sort(dep);

		while(flag) {
			budget = budget - dep.get(result);
			if(budget<0) {flag = false; break;}
			else if(budget==0) {flag = false;}
			result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int budget = 10;
		int[] arr = {5,2,8,9};
		int answer = 0;
	
		Budget b = new Budget();
		//예외처리
		if(arr.length<=0) answer=0;
		else if(arr.length==1 && budget>=arr[0]) answer=1;
		else if(arr.length==1 && budget<arr[0]) answer=0;
		else answer = b.solution(budget,arr);

		
		System.out.println(answer);
		
	}

}

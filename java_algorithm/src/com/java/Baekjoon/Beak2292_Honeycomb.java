package com.java.Baekjoon;

import java.util.Scanner;

public class Beak2292_Honeycomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int lastNum=1;
		int n=1;
		int answer = 0;
		boolean flag = true;
		
		if(number == 1 ) answer=1;
		else {			
			while(flag) {
				lastNum=lastNum+n*6;
				//System.out.println(lastNum);
				
				if(number<=lastNum) {
					flag= false;
					continue;
				}
				n++;
			}
			answer = n+1;
		}
		
		System.out.println(answer);	
	}

}

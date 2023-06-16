package com.java.Inflearn;

import java.util.Scanner;

public class Array4_Fibonacci {

	public static void main(String[] args) {
		//선언
		int n;
		int[] fibo;
		
		Scanner scan = new Scanner(System.in);
		
		//입력
		n=scan.nextInt();
		fibo = new int[n];
		
		fibo[0]=1;
		fibo[1]=1;
		//처리
		for(int i=0;i<n-2;i++) {
			fibo[i+2]=fibo[i]+fibo[i+1];
		}
		//출력
		for(int i=0;i<n;i++) {
			System.out.print(fibo[i]);
			if(i!=n-1) System.out.print(" ");
		}
		
	}
}

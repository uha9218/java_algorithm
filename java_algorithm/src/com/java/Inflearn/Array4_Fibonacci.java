package com.java.Inflearn;

import java.util.Scanner;

public class Array4_Fibonacci {

	public static void main(String[] args) {
		//����
		int n;
		int[] fibo;
		
		Scanner scan = new Scanner(System.in);
		
		//�Է�
		n=scan.nextInt();
		fibo = new int[n];
		
		fibo[0]=1;
		fibo[1]=1;
		//ó��
		for(int i=0;i<n-2;i++) {
			fibo[i+2]=fibo[i]+fibo[i+1];
		}
		//���
		for(int i=0;i<n;i++) {
			System.out.print(fibo[i]);
			if(i!=n-1) System.out.print(" ");
		}
		
	}
}

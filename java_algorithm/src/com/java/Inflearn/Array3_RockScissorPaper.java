package com.java.Inflearn;

import java.util.Scanner;

public class Array3_RockScissorPaper {

	public static void main(String[] args) {
		//����
		int n;
		int[] a; int[] b ;
		char[] result;
		
		Scanner scan =new Scanner(System.in);
		n=scan.nextInt();
		a=new int[n];
		b=new int[n];
		result=new char[n];
		
		//�Է�
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=scan.nextInt();
		}
		
		//ó��
		
		for(int i=0;i<n;i++) {
			switch(b[i]-a[i]) {
			case -2 : 
				result[i] = 'B';
				break;
			case -1 : 
				result[i] = 'A';
				break;
			case 0 : 
				result[i] = 'D';
				break;
			case 1 : 
				result[i] = 'B';
				break;
			case 2 : 
				result[i] = 'A';
				break;
			}
		}
		
		//���
		for(int i=0;i<n;i++) System.out.println(result[i]);
		
	}

}

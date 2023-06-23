package com.java.Baekjoon;

import java.util.Scanner;

public class Beak2003_SumOfNumbers2 {

	public static void main(String[] args) {
		// 선언
		int start = 0;
		int end = 0;
		int n, m;
		int[] arr;
		int sum = 0;
		int count = 0;
		
		//입력
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		//처리
		while(start<=end) {
			if(sum>=m) {sum-=arr[start++]; System.out.printf("(sum>=m)start: %d, end: %d, sum: %d\n",start,end,sum);}
			else if(end == n) {System.out.printf("(end==n)start: %d, end: %d, sum: %d\n",start,end,sum);break;}
			else {sum+=arr[end++];System.out.printf("(sum<m)start: %d, end: %d, sum: %d\n",start,end,sum);}
			
			if(sum==m) count++;			
		}
		System.out.println("answer : "+count);
		
	}

}

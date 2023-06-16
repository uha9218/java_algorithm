package com.java.Inflearn;

import java.util.Scanner;

public class Array2_VisibleStudent {

	public static void main(String[] args) {
		// 선언
		int n;
		int[] arr;
		int count = 1;
		int max;

		Scanner scan = new Scanner(System.in);
		// 입력

		n = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
		max=arr[0];

		// 처리
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
				count++;
			}
		}

		System.out.print(count);

	}

}

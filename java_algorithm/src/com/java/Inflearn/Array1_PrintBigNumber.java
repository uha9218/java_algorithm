package com.java.Inflearn;

import java.util.Scanner;

public class Array1_PrintBigNumber {

	public static void main(String[] args) {
		// ����
		int n;
		int[] arr;
		String result = "";

		Scanner scan = new Scanner(System.in);

		// �Է�
		n = scan.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		// ó��
		result += arr[0]+ " ";
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] < arr[i]) {
				result += arr[i];
				if(i!=n-1) result += " ";
			}
		}

		// ���
		System.out.println(result);

	}

}

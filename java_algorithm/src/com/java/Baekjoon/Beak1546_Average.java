package com.java.Baekjoon;

import java.util.Scanner;

public class Beak1546_Average {

	public static void main(String[] args) {
		int n;
		float sum=0;
		float average;
		
		Scanner scan = new Scanner(System.in);
		n= scan.nextInt();
		
		float max=0;
		for(int i=0;i<n;i++) {
			float tmp = scan.nextFloat();
			max = (max>tmp)?max:tmp;
			sum += tmp;
		}
		average = sum*100f/max/(float)n;
		System.out.println(average);
	}

}

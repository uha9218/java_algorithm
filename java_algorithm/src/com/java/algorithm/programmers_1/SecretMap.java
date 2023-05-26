package com.java.algorithm.programmers_1;

public class SecretMap {

	public static String BinaryToString(int n, int num) {

		String tempBinary = Integer.toBinaryString(num);

		while (tempBinary.length() < n) {
			tempBinary = "0" + tempBinary;
		}
		return tempBinary;

	}

	public static String[] Solution(int n, int[] arr1, int[] arr2) { // 선언
		char map1[][] = new char[n][n];
		char map2[][] = new char[n][n];
		String resultMap[][] = new String[n][n];
		String[] answer = new String[n];

		// 처리 
		//1. arr1,2 를 이진수로 변환 후 map1,2에 넣음

		for (int i = 0; i < n; i++) {
			String tempBinary1 = BinaryToString(n,arr1[i]);			
			String tempBinary2 = BinaryToString(n,arr2[i]);
			
			answer[i]= "";	//answer초기화
			
			for (int j = 0; j < n; j++) {
				map1[i][j] = tempBinary1.charAt(j);
				map2[i][j] = tempBinary2.charAt(j);
				
				//2. map1과 map2를 합침
				if(map1[i][j]=='1'||map2[i][j]=='1') resultMap[i][j]="#";
				else resultMap[i][j]=" ";
				
				answer[i]=answer[i]+resultMap[i][j];	//3. resultMap을 정답형식으로 변환
				}	
		}
	
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		String[] answer = {};
		
		answer=Solution(n,arr1,arr2);
		
		for(int i=0;i<n;i++) {
			System.out.println(answer[i]);
		}
		return;
	}
}

package com.java.programmers1;

public class MinimunRectangle {

	public static void main(String[] args) {
		//int[][] sizes = {{14,4},{19,6},{6,16},{18,7},{7,11}};
		int[][] sizes = {{3,4},{1,2}};
		int maxHeight = 0;
		int maxWidth = 0;
		int tmp;
		int answer;
		
		//ó��
		//1. if(���α���<���α���) ���α��̿� ���α��̸� �ٲ�
		for(int i=0;i<sizes.length;i++) {
			if(sizes[i][1]>sizes[i][0]) {
				tmp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = tmp;
			}
		}
		//2. ���α��� �� max, ���α��� �� max�� ����
		for(int i=0;i<sizes.length;i++) {
			maxHeight=(sizes[i][0]>maxHeight)? sizes[i][0]:maxHeight;
			maxWidth=(sizes[i][1]>maxWidth)? sizes[i][1]:maxWidth;
		}
		
		//3. answer
		answer = maxHeight*maxWidth;
		System.out.println(answer);
	}

}

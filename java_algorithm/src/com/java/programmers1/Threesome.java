package com.java.programmers1;

public class Threesome {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 3, 0, 2, -5};
		int count =0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==0) count++;
				}
			}
		}
		
		System.out.print(count);
	}

}

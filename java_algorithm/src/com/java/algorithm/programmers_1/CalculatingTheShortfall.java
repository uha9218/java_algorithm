package com.java.algorithm.programmers_1;

public class CalculatingTheShortfall {
	
	public static long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        
        for (int i=1;i<=count;i++){
            total = total + (price * i);
        }
        answer = total - money;
        return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long answer = solution(3,20,4);
		System.out.println(answer);		
	}

}

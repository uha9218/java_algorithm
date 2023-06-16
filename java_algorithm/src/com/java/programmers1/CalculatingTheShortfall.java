package com.java.programmers1;

public class CalculatingTheShortfall {
	public static long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        
        for (int i=1;i<=count;i++){
            total = total + (price * i);
        }
        answer = total - money;
        if(answer<0) answer=0;
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 3;
		int money = 20;
		int count = 4;
		long result = solution(price,money,count);
		
		System.out.println(result);
		
	}

}

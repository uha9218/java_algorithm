package com.java.programmers1;

public class NumericStringAndEnglish {

	public static void main(String[] args) {
		//내풀이
		String s="123";
		int answer=0;
	
		if(s.contains("zero")) s=s.replaceAll("zero", "0");
		if(s.contains("one")) s=s.replaceAll("one", "1");
		if(s.contains("two")) s=s.replaceAll("two", "2");
		if(s.contains("three")) s=s.replaceAll("three", "3");
		if(s.contains("four")) s=s.replaceAll("four", "4");
		if(s.contains("five")) s=s.replaceAll("five", "5");
		if(s.contains("six")) s=s.replaceAll("six", "6");
		if(s.contains("seven")) s=s.replaceAll("seven", "7");
		if(s.contains("eight")) s=s.replaceAll("eight", "8");
		if(s.contains("nine")) s=s.replaceAll("nine", "9");
		
		answer= Integer.parseInt(s);
		
		System.out.println(s);
		
		//다른사람 풀이
		String s1 =  "one4seveneight";
		String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s1 = s1.replaceAll(strArr[i], Integer.toString(i));
        }
        System.out.println(Integer.parseInt(s1));
	}

}

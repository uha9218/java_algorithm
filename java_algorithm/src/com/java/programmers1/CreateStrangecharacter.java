package com.java.programmers1;

public class CreateStrangecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Is there a hotel in  this area?  "; // 받는 문자열		
		int lastSpaceNum=0;
		for(int i=s.length();i>0;i--) {
			if(s.charAt(i-1)!=' ') break;
			else lastSpaceNum++;
		}
		
		String str[] = s.split(" ");
		String answer = "";

		for (int i = 0; i < str.length; i++) {
		
			for (int j = 0; j < str[i].length(); j++) {

				if (j % 2 > 0) {
					answer += Character.toLowerCase(str[i].charAt(j));
				}

				else {
					answer += Character.toUpperCase(str[i].charAt(j));
				}
				
			}
			if(i<str.length-1) {answer +=" ";}
		}
		for(int i=0;i<lastSpaceNum;i++) answer+=" ";
		System.out.print(answer);
	}

}

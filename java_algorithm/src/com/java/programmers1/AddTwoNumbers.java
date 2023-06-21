package com.java.programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// 선언
		int[] numbers = { 5,0,2,7 };
		int[] result;
		List stack = new ArrayList();

		// 처리
		int sum = numbers[0] + numbers[1];
		stack.add(sum);

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (i == j)
					continue;
				sum = numbers[i] + numbers[j];
				if (!stack.contains(sum))
					stack.add(sum);
			}
		}

		Collections.sort(stack);

		result = new int[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			result[i] = (int) stack.get(i);
			System.out.println(result[i]);
		}

	}

}

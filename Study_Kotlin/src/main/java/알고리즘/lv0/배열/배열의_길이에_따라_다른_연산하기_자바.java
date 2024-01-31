package 알고리즘.lv0.배열;

import java.util.stream.IntStream;

public class 배열의_길이에_따라_다른_연산하기_자바 {
	public int[] solution(int[] arr, int n) {
		boolean isOdd = arr.length % 2 != 0;
		for (int i = 0; i < arr.length; i++) {
			if (isOdd && i % 2 == 0) arr[i] += n;
			else if (!isOdd && i % 2 != 0) arr[i] += n;
		}
		return arr;
	}
}

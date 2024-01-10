package 알고리즘.lv0.배열;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 이의_영역_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
		System.out.println(Arrays.toString(solution(new int[]{1, 2, 1})));
		System.out.println(Arrays.toString(solution(new int[]{1, 1, 1})));
		System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})));
	}

	public static int[] solution(int[] arr) {
		int num1 = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).min().orElse(-1);
		int num2 = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).max().orElse(-1);

		return num1 != -1 ? Arrays.copyOfRange(arr, num1, num2 + 1) : new int[]{-1};
	}
}

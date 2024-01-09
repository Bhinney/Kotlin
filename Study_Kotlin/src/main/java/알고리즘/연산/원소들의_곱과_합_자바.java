package 알고리즘.연산;

import java.util.stream.IntStream;

public class 원소들의_곱과_합_자바 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
	}
	public static int solution(int[] num_list) {
		int multiply = IntStream.of(num_list).reduce((a, b) -> a * b).orElse(0);
		int sum = (int) Math.pow(IntStream.of(num_list).sum(), 2);

		return multiply < sum ? 1 : 0;
	}
}

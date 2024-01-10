package 알고리즘.lv0.배열;

import java.util.stream.IntStream;

public class 홀수_짝수_자바 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
		System.out.println(solution(new int[]{-1, 2, 5, 6, 3}));
	}

	public static int solution(int[] num_list) {
		int num1 = IntStream.range(0, num_list.length).filter(idx -> idx % 2 == 0).map(idx -> num_list[idx]).sum();
		int num2 = IntStream.range(0, num_list.length).filter(idx -> idx % 2 != 0).map(idx -> num_list[idx]).sum();

		return Math.max(num1, num2);
	}
}

package 알고리즘.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_자르기_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 4, 5}, 1, 3)));
	}

	/* 배열 생성 후, 반복문을 사용하기 */
	public static int[] solution1(int[] numbers, int num1, int num2) {
		int[] ans = new int[num2 - num1 + 1];

		for (int i = num1; i <= num2; i++) {
			ans[i - num1] = numbers[i];
		}

		return ans;
	}

	public static int[] solution2(int[] numbers, int num1, int num2) {
		int[] ans = new int[num2 - num1 + 1];

		if (num2 + 1 - num1 >= 0)
			System.arraycopy(numbers, num1, ans, num1 - num1, num2 + 1 - num1);

		return ans;
	}

	/* 리스트 생성 후, 반복문을 돌며 배열 리스트에 추가 해주기*/
	public static int[] solution(int[] numbers, int num1, int num2) {
		List<Integer> ans = new ArrayList<>();
		for (int i = num1; i <= num2; i++) {
			ans.add(numbers[i]);
		}

		return ans.stream().mapToInt(n -> n).toArray();
	}

	public static int[] solution3(int[] numbers, int num1, int num2) {
		return Arrays.copyOfRange(numbers, num1, num2 + 1);
	}

	public static int[] solution4(int[] numbers, int num1, int num2) {

		return Arrays.stream(numbers).boxed().collect(Collectors.toList())
			.subList(num1, num2 + 1).stream().mapToInt(n -> n).toArray();
	}

}

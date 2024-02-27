package 알고리즘.lv0.배열;

import java.util.Arrays;
import java.util.Stack;

public class 배열만들기6_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {0, 1, 1, 1, 0})));
		System.out.println(Arrays.toString(solution(new int[] {0, 1, 0, 1, 0})));
		System.out.println(Arrays.toString(solution(new int[] {0, 1, 1, 0})));
	}

	public static int[] solution(int[] arr) {
		Stack<Integer> stk = new Stack<>();
		int i = 0;

		while (i < arr.length) {
			/* 만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다. */
			if (stk.isEmpty()) stk.add(arr[i]);

			/* stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다. */
			else if (stk.peek() == arr[i]) stk.pop();

			/* stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다. */
			else stk.add(arr[i]);

			i++;
		}

		if (stk.isEmpty()) stk.add(-1);

		return stk.stream().mapToInt(n -> n).toArray();
	}
}

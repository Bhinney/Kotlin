package 알고리즘.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 배열_만들기4_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1, 4, 2, 5, 3})));
	}

	/*
	 * 만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
	 * stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
	 * stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
	 * */
	// public static int[] solution(int[] arr) {
	// 	ArrayList<Integer> stk = new ArrayList<>();
	// 	int i = 0;
	// 	while (i < arr.length) {
	// 		if (stk.isEmpty()) {
	// 			stk.add(arr[i]);
	// 			i++;
	// 		} else if (stk.get(stk.size() - 1) < arr[i]) {
	// 			stk.add(arr[i]);
	// 			i++;
	// 		} else {
	// 			stk.remove(stk.size() - 1);
	// 		}
	// 	}
	//
	// 	return stk.stream().mapToInt(n -> n).toArray();
	// }

	public static int[] solution(int[] arr) {
		Stack<Integer> stk = new Stack<>();
		int i = 0;

		while (i < arr.length) {
			if (stk.isEmpty()) stk.add(arr[i++]);
			else if (stk.peek() < arr[i]) stk.add(arr[i++]);
			else stk.pop();
		}

		return stk.stream().mapToInt(n -> n).toArray();
	}
}

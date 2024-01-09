package 알고리즘.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class 콜라츠_수열_만들기_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10)));
	}

	public static int[] solution(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		while (n != 1) {
			list.add(n);
			if (n % 2 == 0) n /= 2;
			else n = 3 * n + 1;
		}

		list.add(1);

		return list.stream().mapToInt(i -> i).toArray();
	}
}

package 알고리즘.lv0.etc;

import java.util.Arrays;

public class 아이스_아메리카노_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5_500)));
		System.out.println(Arrays.toString(solution(15_000)));
	}

	public static int[] solution(int money) {

		return new int[]{money / 5_500, money % 5_500};
	}
}

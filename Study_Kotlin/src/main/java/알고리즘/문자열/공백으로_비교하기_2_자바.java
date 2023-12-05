package 알고리즘.문자열;

import java.util.Arrays;

public class 공백으로_비교하기_2_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(" i    love  you")));
	}

	public static String[] solution(String my_string) {

		return my_string.trim().split("\\s+");
	}
}

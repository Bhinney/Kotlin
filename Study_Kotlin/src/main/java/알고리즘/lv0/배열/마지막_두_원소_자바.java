package 알고리즘.lv0.배열;

import java.util.Arrays;

public class 마지막_두_원소_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{2, 1, 6})));
		System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5})));
	}
	public static int[] solution(int[] num_list) {
		int last = num_list[num_list.length - 1];
		int lastMinusOne = num_list[num_list.length - 2];
		int[] answer = new int[num_list.length + 1];
		System.arraycopy(num_list, 0, answer, 0, num_list.length);
		answer[num_list.length] = last > lastMinusOne ? last - lastMinusOne : last * 2;
		return answer;
	}
}

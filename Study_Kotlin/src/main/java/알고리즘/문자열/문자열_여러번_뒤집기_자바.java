package 알고리즘.문자열;

public class 문자열_여러번_뒤집기_자바 {
	public static void main(String[] args) {
		System.out.println(solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
	}
	public static String solution(String my_string, int[][] queries) {
		StringBuilder sb = new StringBuilder(my_string);

		for (int[] q : queries) {
			StringBuilder nsb = new StringBuilder(sb.substring(q[0], q[1] + 1)).reverse();
			sb.replace(q[0], q[1] + 1, nsb.toString());
		}

		return sb.toString();
	}
}

package 알고리즘.문자열;

public class 문자리스트를_문자열로_변환하기_자바 {
	public static void main(String[] args) {
		System.out.println(solution(new String[]{"a","b","c"}));
	}
	public static String solution1(String[] arr) {
		StringBuilder sb = new StringBuilder();

		for (String s : arr) {
			sb.append(s);
		}

		return sb.toString();
	}

	public static String solution(String[] arr) {
		return String.join("", arr);
	}
}

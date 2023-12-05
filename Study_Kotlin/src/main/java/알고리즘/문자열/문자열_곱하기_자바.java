package 알고리즘.문자열;

public class 문자열_곱하기_자바 {
	public static void main(String[] args) {
		System.out.println(solution("string", 3));
	}

	public static String solution(String my_string, int k) {
		return my_string.repeat(k);
	}
}

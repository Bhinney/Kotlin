package 알고리즘.lv0.문자열;

public class 문자열_뒤집기_자바 {
	public static void main(String[] args) {
		System.out.println(solution("jaron"));
	}

	public static String solution(String my_String) {

		return new StringBuilder(my_String).reverse().toString();
	}
}

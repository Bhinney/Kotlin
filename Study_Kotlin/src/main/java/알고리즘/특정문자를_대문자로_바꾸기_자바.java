package 알고리즘;

public class 특정문자를_대문자로_바꾸기_자바 {
	public static void main(String[] args) {
		System.out.println(solution("programmers", "p"));
		System.out.println(solution("i love you", "x"));
	}

	public static String solution(String my_string, String alp) {

		return my_string.replace(alp, alp.toUpperCase());
	}
}

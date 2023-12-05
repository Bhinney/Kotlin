package 알고리즘.자바와_비교.문자열;

public class 문자안에_문자열_자바 {
	public static void main(String[] args) {
		System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
		System.out.println(solution("ppprrrogrammers", "6CD"));
	}

	public static int solution(String str1, String str2) {
		return str1.contains(str2) ? 1 : 2;
	}
}

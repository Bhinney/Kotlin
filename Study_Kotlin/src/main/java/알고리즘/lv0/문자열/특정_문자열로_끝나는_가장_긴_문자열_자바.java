package 알고리즘.lv0.문자열;

public class 특정_문자열로_끝나는_가장_긴_문자열_자바 {
	public static void main(String[] args) {
		System.out.println(solution("AbCdEFG", "dE"));
	}

	public static String solution(String myString, String pat) {
		return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
	}
}

package 알고리즘.lv0.문자열;

public class 간단식_계산하기_자바 {
	public int solution(String binomial) {
		String[] arr = binomial.split(" ");

		return switch (arr[1]) {
			case "+" -> Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
			case "-" -> Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
			case "*" -> Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
			default -> 0;
		};
	}
}

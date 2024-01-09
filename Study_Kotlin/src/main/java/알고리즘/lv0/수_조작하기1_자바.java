package 알고리즘.lv0;

import java.util.HashSet;

public class 수_조작하기1_자바 {
	public static void main(String[] args) {
		System.out.println(solution(0, 	"wsdawsdassw"));
	}
	public static int solution(int n, String control) {
		int ans = n;
		for (char c : control.toCharArray()) {
			switch (c) {
				case 'w' -> ans++;
				case 's' -> ans--;
				case 'd' -> ans += 10;
				case 'a' -> ans -= 10;
				default -> {}
			}
		}
		return ans;
	}
}

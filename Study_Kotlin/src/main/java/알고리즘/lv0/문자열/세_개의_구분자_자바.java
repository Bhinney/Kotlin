package 알고리즘.lv0.문자열;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 세_개의_구분자_자바 {
	public String[] solution(String myStr) {
		myStr = myStr.replace("a", "&").replace("b", "&").replace("c", "&");
		String[] ans = Arrays.stream(myStr.split("&")).filter(arr -> !arr.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
		return ans.length != 0 ? ans : new String[]{"EMPTY"};
	}
}

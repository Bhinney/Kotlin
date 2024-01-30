package 알고리즘.lv0.배열;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ad_제거하기_자바 {
	public String[] solution(String[] strArr) {
		return Arrays.stream(strArr).filter(s -> !s.contains("ad")).collect(Collectors.toList()).toArray(new String[0]);
	}
}

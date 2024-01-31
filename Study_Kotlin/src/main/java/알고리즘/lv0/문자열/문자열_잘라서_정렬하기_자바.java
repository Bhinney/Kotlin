package 알고리즘.lv0.문자열;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자열_잘라서_정렬하기_자바 {
	public String[] solution(String myString) {
		return Arrays.stream(myString.split("x")).sorted().collect(Collectors.toList()).toArray(new String[0]);
	}
}

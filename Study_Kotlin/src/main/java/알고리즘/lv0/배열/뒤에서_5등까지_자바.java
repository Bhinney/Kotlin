package 알고리즘.lv0.배열;

import java.util.stream.IntStream;

public class 뒤에서_5등까지_자바 {
	public int[] solution(int[] num_list) {
		return IntStream.of(num_list).sorted().limit(5).toArray();
	}
}

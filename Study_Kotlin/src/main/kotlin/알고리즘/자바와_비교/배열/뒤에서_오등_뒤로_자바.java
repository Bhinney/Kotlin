package 알고리즘.자바와_비교.배열;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 뒤에서_오등_뒤로_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
	}
	public static int[] solution1(int[] num_list) {

		return Arrays.stream(num_list).sorted().boxed().collect(Collectors.toList()).subList(5, num_list.length).stream().mapToInt(n -> n).toArray();
	}

	public static int[] solution(int[] num_list) {

		// return Arrays.stream(num_list).sorted().skip(5).toArray();
		return IntStream.of(num_list).sorted().skip(5).toArray();
	}
}

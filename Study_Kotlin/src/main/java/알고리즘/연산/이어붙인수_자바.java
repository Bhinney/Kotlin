package 알고리즘.연산;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 이어붙인수_자바 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
	}

	public static int solution(int[] num_list) {

		return Integer.parseInt(IntStream.of(num_list).filter( n -> n % 2 != 0).mapToObj(Objects::toString).collect(Collectors.joining())) + Integer.parseInt(IntStream.of(num_list).filter( n -> n % 2 == 0).mapToObj(Objects::toString).collect(Collectors.joining()));
	}
}

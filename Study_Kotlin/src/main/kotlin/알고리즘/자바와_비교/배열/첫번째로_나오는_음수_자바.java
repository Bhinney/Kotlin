package 알고리즘.자바와_비교.배열;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 첫번째로_나오는_음수_자바 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
		System.out.println(solution(new int[]{13, 22, 53, 24, 15, 6}));
	}
	public static int solution1(int[] num_list) {
		 int num =  IntStream.of(num_list).filter(n -> n < 0).findFirst().orElse(-1);
		 if (num == -1) return num;
		 return IntStream.of(num_list).boxed().collect(Collectors.toList()).indexOf(num);
	}

	public static int solution(int[] num_list) {
		return IntStream.range(0, num_list.length).filter(i -> num_list[i] < 0).findFirst().orElse(-1);
	}
}

package 알고리즘.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 왼쪽_오른쪽_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"u", "u", "l", "r"})));
	}

	public static String[] solution(String[] str_list) {
		int idx = 0;
		boolean isL = true;

		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].equals("l")) {
				idx = i;
				isL = true;
				break;
			} else if (str_list[i].equals("r")) {
				idx = i;
				isL = false;
				break;
			} else continue;
		}

		return isL ? Arrays.copyOfRange(str_list, 0, idx) : Arrays.copyOfRange(str_list, idx + 1, str_list.length);
	}

	// 런타임 에러
	public static String[] solution1(String[] str_list) {
		List<String> list = Arrays.stream(str_list).collect(Collectors.toList());
		if (!list.contains("r") && !list.contains("l")) return new String[]{};

		int l_idx = IntStream.range(0, str_list.length).filter(i -> str_list[i].equals("l")).findFirst().orElse(Integer.MAX_VALUE);
		int r_idx = IntStream.range(0, str_list.length).filter(i -> str_list[i].equals("r")).findFirst().orElse(Integer.MAX_VALUE);

		return l_idx < r_idx ? Arrays.copyOfRange(str_list, 0, l_idx) : Arrays.copyOfRange(str_list, r_idx + 1, str_list.length);
	}
}

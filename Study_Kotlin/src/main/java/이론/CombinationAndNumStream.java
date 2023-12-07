package 이론;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CombinationAndNumStream {
	public static void main(String[] args) {
		stream();
	}

	private static void stream() {
		String[] koreanDays = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		String[] englishDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println("< join? >");
		System.out.println(String.join(", ", koreanDays));
		System.out.println(Arrays.stream(koreanDays).collect(Collectors.joining(", ")));

		System.out.println("\n< reduce() >");
		Arrays.stream(koreanDays).reduce((now, next) -> {
			System.out.println("오늘은 " + now + ", 내일은 " + next);
			return next;
		});
		Arrays.stream(englishDays).reduce((now, next) -> {
			System.out.println(String.format("Today is %s, tomorrow is %s", now, next));
			return next;
		});
		IntStream.of(numbers).reduce((next, total) -> {
			System.out.println("next " + next + " total " + total);
			return total;
		});

		System.out.println("\n< any() && none()? >");
		System.out.println(Arrays.stream(koreanDays).findAny().isPresent());
		System.out.println(Arrays.stream(englishDays).anyMatch(day -> day.startsWith("N")));
		System.out.println(Arrays.stream(koreanDays).findAny().isEmpty());
		System.out.println(Arrays.stream(englishDays).noneMatch(day -> day.startsWith("N")));

		System.out.println("\n< number 관련 >");
		System.out.println(IntStream.of(numbers).max().orElse(0));
		System.out.println(IntStream.of(numbers).min().orElse(0));
		System.out.println(IntStream.of(numbers).sum());
		System.out.println(IntStream.of(numbers).average().orElse(0.0));
	}
}

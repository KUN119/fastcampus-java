package course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        int sumOfSquares = numbers.stream()
                .filter(isEven) // 짝수만 고르기
                .sorted() // 정렬
                .map(n -> n * n) // 각 숫자 제곱해주기
                .reduce(0, Integer::sum); // 각 숫자 더해주기

        System.out.println("any = " + sumOfSquares);
    }
}

package course2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김길동", "이길동");
        System.out.println(list);

        Collections.sort(list, String::compareTo);
        System.out.println(list);

        for (String o : list) {
            System.out.println(o);
        }
    }
}

package course2.part2;

import model2.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        // 멀티 타입 파라미터 제네릭
        Pair<String, Integer> pair = new Pair<>("Hello", 1);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        // Hash(HashMap, Hashtable): 검색을 빠르게 할 수 있는 자료구조
        Map<String, Integer> maps = new HashMap<>();
        maps.put("kor", 60);
        maps.put("eng", 80);
        maps.put("math", 70);

        System.out.println(maps.entrySet());
        System.out.println(maps.keySet()); // maps의 key를 전부 불러온다.
        System.out.println(maps.values()); // maps의 value를 전부 불러온다.

        System.out.println(maps.get("kor")); // key값을 넣어주면 value 값을 출력

        for (Map.Entry<String, Integer> s : maps.entrySet()) {
            System.out.println(s);
        }

    }
}

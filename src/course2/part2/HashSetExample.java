package course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Set: 순서가 없고 중복 불가능하다
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); //중복되지 않기 때문에 x

        System.out.println(set.size());

        set.remove("Apple");

        for (String s : set) {
            System.out.println(s);
        }

        boolean contains = set.contains("Cherry");
        System.out.println("Set Contains Cherry? " + contains);

        set.clear();

        boolean empty = set.isEmpty();
        System.out.println("Set is empty? " + empty);
    }
}

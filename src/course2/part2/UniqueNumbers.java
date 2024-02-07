package course2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        // Set: 중복 불가
        int[] nums = {1,2,3,4,5,2,4,6,7,1,3};

        Set<Integer> uniqueNums = new HashSet<>();

        for (Integer num : nums) {
            uniqueNums.add(num);
        }
        System.out.println(uniqueNums);
    }
}

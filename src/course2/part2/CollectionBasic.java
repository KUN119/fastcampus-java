package course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10,20,30,40,50 5개의 정수(int)를 저장하고 출력
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i*10);
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        for (Integer i : list2) {
            System.out.println(i);
        }

    }
}

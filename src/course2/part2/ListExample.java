package course2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        //String 타입의 배열 생성
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");

        list.remove(0);
        System.out.println(list.size());

        for (String str : list) {
            System.out.println(str);
        }

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(list.size()-1));



//        for (String str : list) {
//            System.out.println(str);
//        }

    }
}

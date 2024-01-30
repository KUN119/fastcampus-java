package course2.part2;

import model2.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        // int 3개를 배열에 저장하고 출력하세요.
        IntArray list = new IntArray();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); //예외 발생 -> 배열의 길이를 늘려줘야 한다.

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

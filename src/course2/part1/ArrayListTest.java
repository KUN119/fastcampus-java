package course2.part1;

import model2.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요

        ArrayList list = new ArrayList(); //Object 배열을 가지고 있다~ 어떤 객체도 받을 수 있다~

        list.add(new Book("Java", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정보", "나길동"));

//        Book vo = (Book)list.get(0);
//        System.out.println(vo);
//
//        vo = (Book)list.get(1);
//        System.out.println(vo);
//
//        vo = (Book)list.get(2);
//        System.out.println(vo);

        System.out.println(list);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}

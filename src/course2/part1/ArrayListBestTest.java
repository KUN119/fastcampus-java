package course2.part1;

import model2.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBestTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요
        // 제네릭을 사용하면 특정 타입만 사용할 수 있따~

        List<Book> list = new ArrayList<Book>(); //Book 타입만 받는다

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

        //다운 캐스팅 할 필요가 없다
        Book vo = list.get(0);
        System.out.println(vo);

        vo = list.get(1);
        System.out.println(vo);

        vo = list.get(2);
        System.out.println(vo);
    }
}


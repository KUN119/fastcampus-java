package course2.part2;

import model2.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        //ArrayList는 기본적으로 Object타입으로 데이터를 받는다
        List list = new ArrayList(); //Object[]

        list.add(new Book("Java", 15000, "한빛", "홍길동"));
        list.add("Hello");

        for (Object o : list) {
            System.out.println("o = " + o);
        }

        //Generic을 이용해서 특정 타입만 받아 타입의 안정성을 보장할 수 있다.
        List<Book> bookList = new ArrayList<>(); // Book[]

        bookList.add(new Book("C++", 17000, "대림", "이길동"));
        // bookList.add("Hello"); // incompatible types error 발생

        System.out.println(bookList);
    }
}

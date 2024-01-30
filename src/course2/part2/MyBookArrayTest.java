package course2.part2;

import model2.Book;
import model2.BookArray;

public class MyBookArrayTest {

    public static void main(String[] args) {
        BookArray list = new BookArray();

        list.add(new Book("Java", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정보", "나길동"));

        System.out.println(list.get(3)); // 예외 발생

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}

package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 사람의 데이터를 저장할 변수를 선언하세요.
        Person p = new Person("홍길동", 30, "010-1234-5678");

        p.play();
        p.eat();
        p.walk();
    }
}

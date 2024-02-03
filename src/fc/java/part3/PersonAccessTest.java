package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        //Q. Person 클래스에 이름, 나이, 전화번호 저장하고 출력하세요.
        Person person = new Person("홍길동", 10, "010-1234-1234");

        person.printPerson();
    }
}

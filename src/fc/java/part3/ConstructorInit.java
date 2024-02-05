package fc.java.part3;

import fc.java.model.PersonVO2;

public class ConstructorInit {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVo객체에 이름, 나이, 전화번호를 저장하고 출력하세요.
        PersonVO2 vo = new PersonVO2("kkk", 23, "010-2322-2323");

        System.out.println(vo.getName());
        System.out.println(vo.getAge());
        System.out.println(vo.getPhone());
    }
}

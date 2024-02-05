package fc.java.part3;

import fc.java.model.PersonVO2;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVo객체에 이름, 나이, 전화번호를 저장하고 출력하세요.
        PersonVO2 vo = new PersonVO2("kkk", 23, "010-2322-2323");
        PersonVO2 vo2 = new PersonVO2();

        System.out.println(vo.getName());
        System.out.println(vo.getAge());
        System.out.println(vo.getPhone());

        System.out.println(vo2.getName());
        System.out.println(vo2.getAge());
        System.out.println(vo2.getPhone());

        System.out.println(vo.toString());
    }
}

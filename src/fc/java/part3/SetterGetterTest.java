package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {

    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        vo.setName("hello");
        vo.setAge(23);
        vo.setPhone("010-1323-1231");

        System.out.println(vo.getName());
        System.out.println(vo.getAge());
        System.out.println(vo.getPhone());
    }
}

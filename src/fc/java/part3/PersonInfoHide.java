package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {

    public static void main(String[] args) {
        // Q. 한 사람의 회원 정보를 저장할 객체를 생성하세요
        PersonVO vo = new PersonVO();
        //private 으로 접근을 막았기 때문에 사용 불가
//        vo.name = "park";
//        vo.age = 19;
//        vo.phone = "010-1234-1234";
//
//        System.out.println(vo.name);

        vo.setName("park");
        vo.setAge(19);
        vo.setPhone("010-1234-1234");
    }
}

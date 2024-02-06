package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        // 객체 변수: 아직 인스턴스 객체가 생성되기 전의 단계
        Student st1;
        Student st2;
        Student st3;

        //인스턴스 객체!
        st1 = new Student("홍길동", "컴공", 37, "bit@empas.com", 20240205, "010-1243-1234");
        st2 = new Student("나길동", "전기", 30, "bit@empas.com", 20240205, "010-1243-1234");
        st3 = new Student("이길동", "전자", 25, "bit@empas.com", 20240205, "010-1243-1234");

        System.out.println("st2 = " + st1);
        System.out.println("st1 = " + st2);
        System.out.println("st3 = " + st3);
    }
}

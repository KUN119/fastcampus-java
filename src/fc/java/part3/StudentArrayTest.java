package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Q. 객체 배열을 이용하여 4명의 학생 데이터를 저장하고 출력하세요.
        Student[] st = new Student[4];
        st[0] = new Student("홍길동", "컴공", 37, "bit@empas.com", 20240205, "010-1243-1234");
        st[1] = new Student("이길동", "전기", 23, "bit334@empas.com", 20240205, "010-1243-1234");
        st[2] = new Student("나길동", "건축", 25, "sum23@empas.com", 20240205, "010-1243-1234");
        st[3] = new Student("김길동", "통신", 20, "how@empas.com", 20240205, "010-1243-1234");

        for (Student student : st) {
            System.out.println(student);
        }
    }
}

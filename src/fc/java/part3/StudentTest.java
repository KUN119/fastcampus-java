package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        // 배열은 동일한 구조! 클래스는 이질적인 구조!의 데이터를 처리한다.

        int[] arr = new int[6];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
        arr[5] = 66;

        for (int i : arr) {
            System.out.println(i);
        }

        // Q. 잘 설계된 학생(Student) 객체를 설계하고 데이터를 저장 한 후 출력하세요.
        Student student = new Student("홍길동", "컴공", 37, "bit@empas.com", 20240205, "010-1243-1234");
        System.out.println(student);
    }
}

package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // 일반사원 객체를 생성하고 데이터를 저장 후 출력
        RempVO rempVO = new RempVO();

        rempVO.name = "홍길동";
        rempVO.age = 23;
        rempVO.phone = "010-1223-2233";
        rempVO.empDate = "2023/08/01";
        rempVO.dept = "개발";
        rempVO.marriage = false;


        System.out.println(rempVO);
    }
}

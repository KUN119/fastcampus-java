package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {

    public static void main(String[] args) {
        // 아래처럼 접근하지 못하게 생성자에 private을 줌
//        AllStatic st = new AllStatic();
//        System.out.println("st.sum(10,20) = " + st.sum(10,20));
//        System.out.println("st.min(10,20) = " + st.min(10,20));
//        System.out.println("st.max(10,20) = " + st.max(10,20));

        System.out.println("AllStatic.sum(10, 23) = " + AllStatic.sum(10, 23));
        System.out.println("AllStatic.min(10, 23) = " + AllStatic.min(10, 23));
        System.out.println("AllStatic.max(10, 23) = " + AllStatic.max(10, 23));

        //java에 이미 클래스가 정의되어 있음
        System.out.println(Math.max(30, 60));
        System.out.println(Math.min(30, 60));
    }
}

package fc.java.part3;

public class StaticTest {
    //static zone에 main, sum 메서드가 올라감
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = StaticTest.sum(a, b); // 일반적으로 static method는 클래스네임.메서드로 호출
        System.out.println("sum = " + sum);
    }

    // Q. 매개변수로 2개의 정수를 입력 받아 총합을 구해 리턴하는 정의하시오.
    public static int sum(int a, int b) {
        return a + b;
    }
}

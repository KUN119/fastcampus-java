package course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장
        int a = 10; // 기본 자료형
        //Integer aa = new Integer(10); //사용자정의 자료형

        Integer aa = 10; // Auto-Boxing이 일어난다
        System.out.println(aa.intValue()); // unboxing

        float f = 10.5f;

        Float ff = f; // Auto-Boxing -> new Float()
        System.out.println(ff.floatValue()); // unboxing


    }
}

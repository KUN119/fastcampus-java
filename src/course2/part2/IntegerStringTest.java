package course2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 + str2);

        int num = Integer.parseInt(str1) + Integer.parseInt(str2); // 인트형으로 변환
        System.out.println(num);

        int su1 = 123;
        int su2 = 123;
        System.out.println(su1 + su2);
        System.out.println(String.valueOf(su1) + String.valueOf(su2)); // 문자열로 변환
    }
}
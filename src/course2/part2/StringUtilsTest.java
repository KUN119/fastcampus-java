package course2.part2;

import model2.Converter;
import model2.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();

        //인스턴스 메서드 참조: 인스턴스 객체를 만들고 참조하는 방식
        Converter<String, String> converter = stringUtils::reverse;
        System.out.println(converter.convert("Hello"));
    }
}

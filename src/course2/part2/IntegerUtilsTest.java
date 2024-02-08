package course2.part2;

import model2.Converter;
import model2.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        System.out.println(converter.convert("300"));
    }
}

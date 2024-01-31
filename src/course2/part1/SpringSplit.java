package course2.part1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SpringSplit {
    public static void main(String[] args) {
        String str = "Hello,World,Java";

        //쉼표를 구분자로 문자열 분리
        String[] strArr = str.split(",");

        for (String s : strArr) {
            System.out.println(s);
        }

        //정규표현식을 사용하여 공백을 구분자로 분리
        String str2 = "Hello World Java";
        String[] str2Arr = str2.split("\\s+"); //공백이 하나 이상있을 경우
        for (String string : str2Arr) {
            System.out.println(string);
        }

        // Scanner 이용
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요:");
        String str3 = scanner.nextLine();
        String[] str3Arr = str3.split("\\s+");
        for (String s : str3Arr) {
            System.out.println(s);
        }

    }
}

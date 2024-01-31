package course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String str1 = "Hello";
        String str2 = "World";

        if (str1.equals(str2)) {
            System.out.println("문자열이 같습니다.");
        } else {
            System.out.println("문자열이 다릅니다.");
        }

        // compareTo(): 문자열을 사전순으로 비교
        // 두 문자가 같으면 0 반환
        // str3<str4:음수, str3>str4:양수 반환
        String str3 = "apple";
        String str4 = "banana";

        int result = str3.compareTo(str4);

        if(result == 0){
            System.out.println("문자열이 같습니다.");
        } else if (result < 0) {
            System.out.println("str3이 str4보다 작습니다.");
        } else {
            System.out.println("str3이 str4보다 큽니다.");
        }
    }
}

package course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        // HelloWorld라는 문자열을 생성하시오.
        String str = "HelloWolrd";
        System.out.println("str.charAt(1); = " + str.charAt(1));
        System.out.println("str.replaceAll(\"o\", \"X\") = " + str.replaceAll("o", "X"));
        System.out.println("str.length() = " + str.length());
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        System.out.println("str.substring(5) = " + str.substring(5));
        System.out.println("str.substring(5, 8) = " + str.substring(5, 8));
        System.out.println("str.indexOf(\"Wo\") = " + str.indexOf("Wo"));

        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}

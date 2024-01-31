package course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str = new String("Hello World"); //Heap memory에 생성
        System.out.println("str:" + str);

        String str1 = "Hello World"; //Literal Pool memory에 생성
        System.out.println("str1:" + str1);
    }
}

//Literal Pool memory: 재활용 공간

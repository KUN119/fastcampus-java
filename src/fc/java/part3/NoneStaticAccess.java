package fc.java.part3;

import fc.java.model.MyUtil;

public class NoneStaticAccess {

    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        //MyUtil
        //none static method 받는법: 객체 생성
        MyUtil my = new MyUtil();
        int sum = my.noneStaticSum(a,b);

        //static method 받는법: 클래스이름.호출메서드명 -> 자주 사용하는 경우 static method를 사용한다.
        System.out.println("MyUtil.sum(a, b)= " + MyUtil.sum(a, b));


        System.out.println("sum = " + sum);
    }
}

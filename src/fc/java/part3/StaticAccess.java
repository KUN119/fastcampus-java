package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {

    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        //MyUtil
        int sum = MyUtil.sum(a, b); //static method 접근: 클래스이름.메서드
        System.out.println("sum = " + sum);
    }
}
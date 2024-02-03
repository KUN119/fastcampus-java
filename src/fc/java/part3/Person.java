package fc.java.part3;

public class Person {
    private String name;
    private int age;
    private String phone;

    //기본 생성자 메서드
    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void printPerson() {
        System.out.println("이름:" + name + " 나이:" + age + " 전화번호:" + phone);
    }

    public void play() {
        System.out.println("운동을 한다.");
    }

    public void eat() {
        System.out.println("음식을 먹다.");
    }

    public void walk() {
        System.out.println("걷다.");
    }
}

package fc.java.model;

public class Dog extends Animal{

    @Override //재정의
    public void eat() {
        System.out.println("개처럼 먹다");
    }
}

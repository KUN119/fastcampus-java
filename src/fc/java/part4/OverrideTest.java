package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        Animal dog = new Dog();//업캐스팅
        dog.eat(); // Animal ------동적 바인딩------> Dog

        Animal cat = new Cat();//업캐스팅
        cat.eat(); // Animal ------동적 바인딩------> Dog

        ((Cat) cat).night();
    }
}

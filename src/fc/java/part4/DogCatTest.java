package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        //업캐스팅: 부모가 자식을 가리킨다.
        Animal dog = new Dog();
        dog.eat();

        Animal cat = new Cat();
        cat.eat();
    }
}

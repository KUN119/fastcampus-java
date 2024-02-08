package course2.part2;

import model2.Person;
import model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        //생성자 참조
        PersonFactory personFactory = Person::new;
        Person person =  personFactory.create("Park", 23);
        System.out.println(person);
    }
}

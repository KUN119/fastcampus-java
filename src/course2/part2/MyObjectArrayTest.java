package course2.part2;

import model2.A;
import model2.B;
import model2.C;
import model2.ObjectArray;

public class MyObjectArrayTest {

    public static void main(String[] args) {
         // A B C 객체를 배엘 Objetc[]에 저장하고 출력하시오.
        ObjectArray list = new ObjectArray();

        list.add(new A());
        list.add(new B());
        list.add(new C());

        A a = (A)list.get(0); // A <= Object
        a.display();

        B b = (B)list.get(0); // B <= Object
        b.display();

        C c = (C)list.get(0); // C <= Object
        c.display();



    }
}

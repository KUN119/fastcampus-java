package course2.part1;

import model2.BB;
import model2.CC;

//CC를 이용하여 BB를 동작시키는 프로그래밍(인터페이스 기반 프로그래밍)
public class InterfaceAPI {
    public static void main(String[] args) {
        CC c = new BB();

        c.x();//BB의 x()가 동작 -> 동적바인딩
        c.y();
        c.z();
    }
}

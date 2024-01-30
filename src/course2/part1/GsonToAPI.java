package course2.part1;

import com.google.gson.Gson;
import model2.Person;

//Gson: 객체 <-> Json 변환해주는 구글에서 만든 API
public class GsonToAPI {

    public static void main(String[] args) {
        Person person = new Person("John", 30);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json); //{"name":"John","age":30}
    }
}

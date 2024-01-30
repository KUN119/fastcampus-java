package course2.part1;

import com.google.gson.Gson;
import model2.Person;

public class GsonFromAPI {

    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30}"; //Json -> person
        Gson gson = new Gson();

        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.toString());

    }
}

/*
Quiz
1. Random random = new Random();
    random.nextInt(10) + 1;

2. JSON

3. {"name":"홍길동","age":30}

4. fromJson()

5. toJson()

*/
package course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //Key-Value 형태의 데이터를 관리하는 Map 객체 생성
        Map<String, Integer> studentScores = new HashMap<>();

        //데이터 추가
        studentScores.put("kim", 93);
        studentScores.put("choi", 90);
        studentScores.put("park", 83);
        studentScores.put("lee", 20);

        //데이터 조회
        System.out.println("kim's score: " + studentScores.get("kim"));
        System.out.println("choi's score: " + studentScores.get("choi"));

        //데이터 수정
        studentScores.put("lee", 70);
        System.out.println("lee's score: " + studentScores.get("lee"));

        //데이터 삭제
        studentScores.remove("choi");
        System.out.println(studentScores);
        
        //전체 데이터 출력
        for (Map.Entry<String, Integer> entry: studentScores.entrySet()) {
            System.out.println(entry.getKey() + "'s score:" + entry.getValue());
        }
    }
}

package course2.part2;

import model2.MovieVO;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<MovieVO> list = new ArrayList<MovieVO>();

        list.add(new MovieVO("괴물", "봉준호", "2006", "한국"));
        list.add(new MovieVO("기생충", "봉준호", "2019", "한국"));
        list.add(new MovieVO("완벽한 타인", "이재규", "2018", "한국"));

//        for (MovieVO movieVO : list) {
//            System.out.println(movieVO);
//        }

        // 영화제목 기생충 찾기
        for (MovieVO movieVO : list) {
            if(movieVO.getTitle().equals("기생충")){
                System.out.println(movieVO);
                break;
            }
        }
    }
}

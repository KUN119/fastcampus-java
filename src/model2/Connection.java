package model2;
// interface는 자바에서 제공을 한다.
public interface Connection {
    //DB 연결 동작
    public void getConnection(String url, String username, String password);
}

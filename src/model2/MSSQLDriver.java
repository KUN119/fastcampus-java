package model2;

public class MSSQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용 MSSQL DB에 접속을 시도한다.");
    }
}

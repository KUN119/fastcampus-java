package model2;
//OracleDriver는 Oracle회사에서 만들에서 제공한다: Driver
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용 Oracle DB에 접속을 시도한다.");
    }
}

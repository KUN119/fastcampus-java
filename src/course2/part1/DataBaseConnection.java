package course2.part1;

import model2.Connection;
import model2.MSSQLDriver;
import model2.MySQLDriver;
import model2.OracleDriver;

public class DataBaseConnection {

    public static void main(String[] args) {
        //oracle DB 접속
        Connection conn =new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");

        conn = new MySQLDriver();
        conn.getConnection("","","");

        conn = new MSSQLDriver();
        conn.getConnection("","","");
    }
}

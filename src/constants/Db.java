package constants;

import java.sql.*;

public class Db {
    public boolean check(String user,String pass) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String host = "root";
        String password="";
        String sql = "select * from login where name=? and pass=?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,host,password);
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1,user);
        stm.setString(2,pass);
        ResultSet rs = stm.executeQuery();
        if(rs.next()){
            return true;
        }
        else {
            return false;
        }
    }
}

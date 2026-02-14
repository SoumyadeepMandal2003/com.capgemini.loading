package JDBC;

import java.sql.*;
//import java.sql.DriverManager
//import java.sql.ResultSet;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        String sql = "Select * from emp";
        String url = "jdbc:mysql://localhost:3306/scott";
        String userName = "root";
        String pass = "user";
        Connection con = DriverManager.getConnection(url, userName, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
//        rs.next();
        while(rs.next()) {
            System.out.println(rs.getInt("empno") + " "
                    + rs.getString("ename") + " "
                    + rs.getString("job")+" "
                    + rs.getInt("sal") + " "
            );
        }

        con.close();

    }
}

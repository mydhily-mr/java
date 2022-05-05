package crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateSingleRow
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final String sql_query = "update employees set esal=1000000 where ename='sachin'";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final Statement st = con.createStatement();
        final int updateCount = st.executeUpdate(sql_query);
        System.out.println("The number of rows updated :" + updateCount);
        con.close();
    }
}
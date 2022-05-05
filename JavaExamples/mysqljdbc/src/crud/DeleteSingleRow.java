package crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DeleteSingleRow
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final String sqlQuery = "delete from employees where ename='sagar'";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final Statement st = con.createStatement();
        final int updateCount = st.executeUpdate(sqlQuery);
        System.out.println("The number of rows deleted :" + updateCount);
        con.close();
    }
}
package crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CrudD
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final String sql_query = "drop table emp";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final Statement st = con.createStatement();
        st.executeUpdate(sql_query);
        System.out.println("Table deleted successfully..!");
        con.close();
    }
}
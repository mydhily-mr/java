package crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CrudC
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final String sql_query = "create table employees(eno int(5) primary key,ename varchar(20),esal double(10,2),eaddr varchar(20))";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final Statement st = con.createStatement();
        st.executeUpdate(sql_query);
        System.out.println("Table Created Successfully");
        con.close();
    }
}
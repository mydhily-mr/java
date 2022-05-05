package crud;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class SelectParticularColoumns
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final Statement st = con.createStatement();
        final String sqlQuery = "select ename,eaddr from employees";
        boolean flag = false;
        final ResultSet rs = st.executeQuery(sqlQuery);
        System.out.println("ENAME \t EADDR");
        System.out.println("------------------");
        while (rs.next()) {
            flag = true;
            System.out.println(String.valueOf(rs.getString("ename")) + "\t" + rs.getString("eaddr"));
        }
        if (!flag) {
            System.out.println("No Records found");
        }
        con.close();
    }
}
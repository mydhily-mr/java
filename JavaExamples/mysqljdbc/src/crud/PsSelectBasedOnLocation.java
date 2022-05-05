package crud;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class PsSelectBasedOnLocation
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final String sqlQuery = "select ename, eaddr from employees where eaddr=\"kochi\" ";
        final PreparedStatement pst = con.prepareStatement(sqlQuery);
        boolean flag = false;
        final ResultSet rs = pst.executeQuery(sqlQuery);
        while (rs.next()) {
            flag = true;
            System.out.println(rs.getString(1));
        }
        if (!flag) {
            System.out.println("No Records found");
        }
        con.close();
    }
}
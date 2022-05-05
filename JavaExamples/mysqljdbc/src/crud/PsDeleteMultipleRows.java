package crud;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class PsDeleteMultipleRows
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final String sqlQuery = "delete from employees where eno=?";
        final PreparedStatement pst = con.prepareStatement(sqlQuery);
        pst.setInt(1, 1);
        final int updateCount = pst.executeUpdate();
        System.out.println("The number of rows updated :" + updateCount);
        System.out.println("Reusing PreparedStatement to update 2 more record...");
        pst.setInt(1, 4);
        final int updateCount2 = pst.executeUpdate();
        System.out.println("The number of rows updated :" + updateCount2);
        con.close();
    }
}
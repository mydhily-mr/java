package ps;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class PsDemo
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final String sqlQuery = "delete from employees where ename=?";
        final PreparedStatement pst = con.prepareStatement(sqlQuery);
        pst.setString(1, "sachin");
        final int updateCount = pst.executeUpdate();
        System.out.println("The number of rows deleted :" + updateCount);
        System.out.println("Reusing PreparedStatement to delete one more record...");
        pst.setString(1, "anju");
        final int updateCount2 = pst.executeUpdate();
        System.out.println("The number of rows deleted :" + updateCount2);
        con.close();
    }
}
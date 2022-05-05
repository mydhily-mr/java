package crud;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class PsUpdateMultipleRows
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final String sqlQuery = "update employees set ename=? where eno=?";
        final PreparedStatement pst = con.prepareStatement(sqlQuery);
        pst.setString(1, "Anu Radhakrishnan");
        pst.setInt(2, 14);
        final int updateCount = pst.executeUpdate();
        System.out.println("Reusing PreparedStatement to update 2 more record...");
        pst.setString(1, "Raju Gopinath");
        pst.setInt(2, 13);
        final int updateCount2 = pst.executeUpdate();
        pst.setString(1, "Anagha Ammu");
        pst.setInt(2, 37);
        final int updateCount3 = pst.executeUpdate();
        con.close();
    }
}
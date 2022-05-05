package crud;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class PsInsertMultipleRows
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final String sqlQuery = "insert into employees values(?,?,?,?)";
        final PreparedStatement pst = con.prepareStatement(sqlQuery);
        pst.setInt(1, 18);
        pst.setString(2, "anjali");
        pst.setDouble(3, 400.0);
        pst.setString(4, "banglore");
        final int updateCount = pst.executeUpdate();
        System.out.println("The number of rows inserted :" + updateCount);
        System.out.println("Reusing PreparedStatement to insert one more record...");
        pst.setInt(1, 15);
        pst.setString(2, "sraju");
        pst.setDouble(3, 40000.0);
        pst.setString(4, "chennai");
        final int updateCount2 = pst.executeUpdate();
        System.out.println("The number of rows inserted :" + updateCount2);
        con.close();
    }
}
package programs;

import java.sql.SQLException;
import java.sql.Driver;
import java.sql.DriverManager;
import oracle.jdbc.OracleDriver;

public class JdbcConnection
{
    public static void main(final String[] args) {
        try {
            DriverManager.registerDriver((Driver)new OracleDriver());
            System.out.println("Driver loaded Successfully");
            DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "system", "root");
            System.out.println("Connection Successful");
        }
        catch (SQLException e) {
            System.out.println("Some problem in connection");
            e.printStackTrace();
        }
    }
}
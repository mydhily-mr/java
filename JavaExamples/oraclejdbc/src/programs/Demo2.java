package programs;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Demo2
{
    public static void main(final String[] args) {
        final String dbURL = "jdbc:oracle:thin:@//localhost:1521/XE";
        final String username = "system";
        final String password = "root";
        try {
            final Connection connection = DriverManager.getConnection(dbURL, username, password);
            final String sql = "INSERT INTO students(name,email)VALUES ('anju' , 'anju@gmail.com')";
            final Statement statement = connection.createStatement();
            final int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("A row has been inserted");
            }
            connection.close();
        }
        catch (SQLException e) {
            System.out.println("OOPS....Error!!!!");
            e.printStackTrace();
        }
    }
}
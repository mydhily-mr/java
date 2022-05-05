package mysqldemo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Demo
{
    public static void main(final String[] args) {
        try {
            final Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_hr", "root", "3737");
            final Statement mystmt = mycon.createStatement();
            final ResultSet myres = mystmt.executeQuery("SELECT * fROM employees");
            while (myres.next()) {
                System.out.println(myres.getString("job_title"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
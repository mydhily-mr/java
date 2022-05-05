package programs;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Demo
{
    public static void main(final String[] args) throws Exception {
        final Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "system", "root");
        final Statement st = con.createStatement();
        final ResultSet rs = st.executeQuery("SELECT * fROM students");
        while (rs.next()) {
            System.out.println(String.valueOf(rs.getInt(1)) + ".." + rs.getString(2) + ".." + rs.getString(2) + " ");
        }
        con.close();
    }
}
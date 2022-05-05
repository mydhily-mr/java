package sp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class StoredProcedureDemo2
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final CallableStatement cst = con.prepareCall("{call getSal(?,?)}");
        cst.setInt(1, 13);
        cst.registerOutParameter(2, 6);
        cst.execute();
        System.out.println("Salary ..." + cst.getFloat(2));
        con.close();
    }
}
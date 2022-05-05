package sp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class StoredProcedureDemo
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final CallableStatement cst = con.prepareCall("{call addProc(?,?,?)}");
        cst.setInt(1, 100);
        cst.setInt(2, 200);
        cst.registerOutParameter(3, 4);
        cst.execute();
        System.out.println("Result.." + cst.getInt(3));
        con.close();
    }
}
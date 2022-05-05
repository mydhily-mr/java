package batch;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class SimpleBatchDemo
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final Statement st = con.createStatement();
        st.addBatch("insert into employees values(60,'Mahendra',60000,'kerala')");
        st.addBatch("update employees set esal=esal+1000 where esal<4000");
        st.addBatch("delete from employees where esal>40000");
        final int[] count = st.executeBatch();
        int updateCount = 0;
        int[] array;
        for (int length = (array = count).length, i = 0; i < length; ++i) {
            final int x = array[i];
            updateCount += x;
        }
        System.out.println("The number of rows updated :" + updateCount);
        con.close();
    }
}
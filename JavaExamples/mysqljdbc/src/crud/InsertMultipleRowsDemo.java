package crud;

import java.sql.Statement;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;

public class InsertMultipleRowsDemo
{
    public static void main(final String[] args) throws Exception {
        final String jdbc_url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String pwd = "3737";
        final Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        final Statement st = con.createStatement();
        final Scanner sc = new Scanner(System.in);
        String option;
        do {
            System.out.println("Employee Number:");
            final int eno = sc.nextInt();
            System.out.println("Employee Name:");
            final String ename = sc.next();
            System.out.println("Employee Sal:");
            final double esal = sc.nextDouble();
            System.out.println("Employee Address:");
            final String eaddr = sc.next();
            final String sqlQuery = String.format("insert into employees values(%d,'%s',%f,'%s')", eno, ename, esal, eaddr);
            st.executeUpdate(sqlQuery);
            System.out.println("Record Inserted Successfully");
            System.out.println("Do U want to Insert one more record[Yes/No]:");
            option = sc.next();
        } while (!option.equalsIgnoreCase("No"));
        con.close();
    }
}
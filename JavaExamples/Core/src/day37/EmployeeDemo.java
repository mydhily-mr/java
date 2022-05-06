package day37;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeDemo
{
    public static void main(final String[] args) {
        final Employee e1 = new Employee("arpita", 100);
        final Employee e2 = new Employee("vaishnavi", 200);
        final Employee e3 = new Employee("Radika", 50);
        final Employee e4 = new Employee("Mydhily", 150);
        final TreeSet t1 = new TreeSet();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        System.out.println(t1);
        final TreeSet t2 = new TreeSet(new MyComparator4());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        System.out.println(t2);
    }
}

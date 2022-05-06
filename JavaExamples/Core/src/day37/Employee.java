//consider employee & employeeDemo

package day37;

import java.util.Comparator;

class Employee implements Comparable
{
    String name;
    int eid;
    
    Employee(final String name, final int eid) {
        this.name = name;
        this.eid = eid;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.name) + "----" + this.eid;
    }
    
    @Override
    public int compareTo(final Object o) {
        final int eid1 = this.eid;
        final int eid2 = ((Employee)o).eid;
        if (eid1 < eid2) {
            return -1;
        }
        if (eid1 > eid2) {
            return 1;
        }
        return 0;
    }
}

//employee demo
class MyComparator4 implements Comparator
{
    @Override
    public int compare(final Object obj1, final Object obj2) {
        final Employee e1 = (Employee)obj1;
        final Employee e2 = (Employee)obj2;
        final String s1 = e1.name;
        final String s2 = e2.name;
        return s1.compareTo(s2);
    }
}
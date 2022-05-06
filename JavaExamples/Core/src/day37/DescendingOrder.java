package day37;

import java.util.Comparator;
import java.util.TreeSet;

public class DescendingOrder
{
    public static void main(final String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(10);
        System.out.println(t);
    }
}

class MyComparator implements Comparator
{
    @Override
    public int compare(final Object obj1, final Object obj2) {
        final Integer i1 = (Integer)obj1;
        final Integer i2 = (Integer)obj2;
        if (i1 < i2) {
            return 1;
        }
        if (i1 > i2) {
            return -100;
        }
        return 0;
    }
}

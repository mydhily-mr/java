package day37;

import java.util.Comparator;
import java.util.TreeSet;

public class AlphabetOrder
{
    public static void main(final String[] args) {
        final TreeSet t = new TreeSet(new MyComparator3());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t);
    }
}

class MyComparator3 implements Comparator
{
    @Override
    public int compare(final Object obj1, final Object obj2) {
        final String s1 = obj1.toString();
        final String s2 = obj2.toString();
        return s1.compareTo(s2);
    }
}
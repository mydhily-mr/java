package day37;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseAlphabetOrder
{
    public static void main(final String[] args) {
        final TreeSet t = new TreeSet(new MyComparator1());
        t.add("Pratiksha");
        t.add("Arti");
        t.add("Neha");
        t.add("Deepali");
        System.out.println(t);
    }
}

class MyComparator1 implements Comparator
{
    @Override
    public int compare(final Object obj1, final Object obj2) {
        final String s1 = obj1.toString();
        final String s2 = (String)obj2;
        return s2.compareTo(s1);
    }
}

package day38;

import java.util.HashMap;

public class HashMapDemo2
{
    public static void main(final String[] args) {
        final HashMap m = new HashMap();
        final Integer i1 = new Integer(10);
        final Integer i2 = new Integer(10);
        m.put(i1, "pavan");
        m.put(i2, "kalyan");
        System.out.println(m);
        final Integer i3 = new Integer(12);
        final Integer i4 = new Integer(18);
        m.put(i3, "rahul");
        m.put(i4, "dhoni");
        System.out.println(m);
    }
}
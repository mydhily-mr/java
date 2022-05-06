package day38;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo
{
    public static void main(final String[] args) {
        final IdentityHashMap m = new IdentityHashMap();
        final Integer i1 = new Integer(10);
        final Integer i2 = new Integer(10);
        m.put(i1, "pavan");
        m.put(i2, "kalyan");
        System.out.println(m);
    }
}
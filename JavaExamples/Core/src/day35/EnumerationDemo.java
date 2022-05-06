package day35;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo
{
    public static void main(final String[] args) {
        final Vector v = new Vector();
        for (int i = 0; i <= 10; ++i) {
            v.addElement(i);
        }
        System.out.println(v);
        final Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            final Integer j = (Integer) e.nextElement();
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        System.out.println(v);
    }
}
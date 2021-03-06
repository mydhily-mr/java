package day35;

import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo
{
    public static void main(final String[] args) {
        final ArrayList a = new ArrayList();
        for (int i = 0; i <= 10; ++i) {
            a.add(i);
        }
        System.out.println(a);
        final Iterator itr = a.iterator();
        while (itr.hasNext()) {
            final Integer j = (Integer) itr.next();
            if (j % 2 == 0) {
                System.out.println(j);
            }
            else {
                itr.remove();
            }
        }
        System.out.println(a);
    }
}
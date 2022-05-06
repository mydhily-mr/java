package day35;

import java.util.ListIterator;
import java.util.LinkedList;

public class ListIteratorCase2
{
    public static void main(final String[] args) {
        final LinkedList l = new LinkedList();
        l.add("sachin");
        l.add("virat");
        l.add("rahul");
        l.add("dhoni");
        System.out.println(l);
        final ListIterator itr = l.listIterator();
        while (itr.hasNext()) {
            final String s = (String) itr.next();
            if (s.equals("virat")) {
                itr.set("Virat Kohli");
            }
        }
        System.out.println(l);
    }
}